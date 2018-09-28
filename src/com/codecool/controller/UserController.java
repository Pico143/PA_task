package com.codecool.controller;

import com.codecool.entity.MediaItem;
import com.codecool.entity.User;

import java.util.ArrayList;

public class UserController {
    private User currentUser;

    private static UserController instance = null;

    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    private UserController() {

    }

    public void showUserMenu() {

    }

    private void showSearchMenu() {

    }

    private void showResults(ArrayList<MediaItem> results) {

    }

    private void showSpecificMediaItem(MediaItem item) {

    }

    private void showAllMediaItems() {

    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
