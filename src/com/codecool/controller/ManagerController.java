package com.codecool.controller;

import com.codecool.entity.User;
import com.codecool.view.View;

public class ManagerController {
    private User currentUser;

    private static ManagerController instance = null;

    public static ManagerController getInstance() {
        if (instance == null) {
            instance = new ManagerController();
        }
        return instance;
    }

    private ManagerController() {

    }


    public void showManagerMenu() {
        View.getInstance().displayMessage("1. Edit metadata of a chosen MediaItem");
        View.getInstance().displayMessage("2. Add Mediaitem to library");
        View.getInstance().displayMessage("3. Remove mediaitems from library");
    }

    void addMediaItem() {

    }

    void removeMediaItem() {

    }

    void editMediaItem() {

    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
