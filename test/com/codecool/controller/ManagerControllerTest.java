package com.codecool.controller;

import com.codecool.DAO.JDBCDAO;
import com.codecool.entity.MediaItem;
import com.codecool.entity.Movie;
import com.codecool.entity.Newspaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ManagerControllerTest {

    @BeforeEach
    void setupTests() {
        ArrayList itemList = JDBCDAO.getInstance().getAllMediaItems();
        itemList.clear();
    }

    @Test
    void addMediaItem() {
        // test if empty
        JDBCDAO Dao = JDBCDAO.getInstance();
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        Assertions.assertEquals(Dao.getAllMediaItems(), mediaItems);

        // create test item
        MediaItem newspaper = new Newspaper();
        int ID = 1;
        newspaper.setID(ID);

        // add item to list and assert if added
        ManagerController.getInstance().addMediaItem(newspaper);
        Assertions.assertEquals(newspaper, Dao.getSpecificMediaItemByID(ID));
    }

    @Test
    void editMediaItem() {
        // test if empty
        JDBCDAO Dao = JDBCDAO.getInstance();
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        Assertions.assertEquals(Dao.getAllMediaItems(), mediaItems);

        //add some item
        MediaItem movie = new Movie();
        int ID = 1;
        movie.setID(ID);
        ManagerController.getInstance().addMediaItem(movie);
        Assertions.assertEquals(movie, Dao.getSpecificMediaItemByID(ID));

        //check if description empty
        Assertions.assertNull(Dao.getSpecificMediaItemByID(ID).getDescription());

        //edit that item
        String description = "now there is some description";
        movie.setDescription(description);
        ManagerController.getInstance().editMediaItem(movie);

        //assert if edited
        Assertions.assertEquals(description, Dao.getSpecificMediaItemByID(ID).getDescription());
    }
}