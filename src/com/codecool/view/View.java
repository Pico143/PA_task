package com.codecool.view;

import com.codecool.entity.MediaItem;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    private static View instance = null;

    public static View getInstance() {
        if (instance == null) {
            instance = new View();
        }
        return instance;
    }
    public void displayLoginMenu() {

    }

    public void displayManagerMenu() {

    }

    public void displayUserMenu() {

    }

    public void displayMessage(String message) {

    }

    public String getUserInput() {
        return this.scanner.nextLine();
    }

    public void displayMediaItem(MediaItem item) {

    }

    public void displayItemSet(ArrayList<MediaItem> itemSet) {

    }
}
