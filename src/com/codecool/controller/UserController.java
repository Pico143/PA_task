package com.codecool.controller;

import com.codecool.entity.*;
import com.codecool.entity.Readable;
import com.codecool.view.View;

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
        View.getInstance().displayMessage("1. Search for a media item.");
        View.getInstance().displayMessage("2. See all media items.");
        View.getInstance().displayMessage("3. Preview a media item.");
        String input = View.getInstance().getUserInput();

        if (input.equals("3")) {
            View.getInstance().displayMessage("here we would choose a media item, for test purposes we preview a game");
            Games game = new Games();
            previewMediaItem(game);

        }
    }

    public void showSearchMenu() {

    }

    public void showResults(ArrayList<MediaItem> results) {

    }

    public void showSpecificMediaItem(MediaItem item) {

    }

    public void showAllMediaItems() {

    }

    public void previewMediaItem(MediaItem item) {
        if (item instanceof Audible) {
            ((Audible) item).listenItem();
        } else if (item instanceof Readable) {
            ((Readable) item).readItem();
        } else if (item instanceof Watchable) {
            ((Watchable) item).watchItem();
        } else if (item instanceof Playable) {
            ((Playable) item).playItem();
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
