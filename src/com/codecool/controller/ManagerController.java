package com.codecool.controller;

import com.codecool.DAO.JDBCDAO;
import com.codecool.entity.Book;
import com.codecool.entity.MediaItem;
import com.codecool.entity.User;
import com.codecool.view.View;

import java.util.Scanner;

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
        String input = View.getInstance().getUserInput();
        if (input.equals("2")) {
            View.getInstance().displayMessage("Sample mediaitem was added now with author:");
            Book book = new Book();
            book.setAuthor("Marcin");
            this.addMediaItem(book);
            View.getInstance().displayMessage(book.getAuthor());
        }

    }

    void addMediaItem(MediaItem mediaItem) {
        JDBCDAO.getInstance().addMediaItem(mediaItem);
    }

    void removeMediaItem(MediaItem mediaItem) {

    }

    void editMediaItem(MediaItem updatedItem) {
        JDBCDAO.getInstance().updateItemData(updatedItem);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
