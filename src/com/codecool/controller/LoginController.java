package com.codecool.controller;

import com.codecool.entity.User;
import com.codecool.entity.UserRole;
import com.codecool.view.View;

public class LoginController {
    private static LoginController instance = null;

    public static LoginController getInstance() {
        if (instance == null) {
            instance = new LoginController();
        }
        return instance;
    }

    private LoginController() {

    }


    public void showLoginMenu() {
        View.getInstance().displayMessage("choose who do you want to login as");
        View.getInstance().displayMessage("1.User");
        View.getInstance().displayMessage("2.Manager");
        String input = View.getInstance().getUserInput();
        User user = new User();
        if (input.equals("2")) {
            user = this.resolveLogin("Manager", "1234");
        } else {
            user = this.resolveLogin("User", "1234");
        }
        if (user.getUserRole() == UserRole.MANAGER) {
            View.getInstance().displayMessage("For test purposes we're logged in as manager...");
            ManagerController.getInstance().setCurrentUser(user);
            ManagerController.getInstance().showManagerMenu();
        } else {
            View.getInstance().displayMessage("For test purposes we're logged in as user...");
            UserController.getInstance().setCurrentUser(user);
            UserController.getInstance().showUserMenu();
        }
    }

    User resolveLogin(String login, String password) {
        User user = new User();
        user.setUsername(login);
        user.setPassword(password);
        if (login == "Manager") {
            user.setUserRole(UserRole.MANAGER);
        } else {
            user.setUserRole(UserRole.USER);
        }
        return user;
    }
}
