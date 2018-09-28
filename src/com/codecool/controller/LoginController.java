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
        User user = this.resolveLogin("Manager", "1234");
        if (user.getUserRole() == UserRole.MANAGER) {
            ManagerController.getInstance().setCurrentUser(user);
            ManagerController.getInstance().showManagerMenu();
        }
    }

    User resolveLogin(String login, String password) {
        View.getInstance().displayMessage("For test purposes we're already logged in as manager...");
        User user = new User();
        user.setUsername(login);
        user.setPassword(password);
        user.setUserRole(UserRole.MANAGER);
        return user;
    }
}
