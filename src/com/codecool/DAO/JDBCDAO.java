package com.codecool.DAO;

import com.codecool.entity.MediaItem;
import com.codecool.entity.User;

import java.util.ArrayList;

public class JDBCDAO implements DAO {

    private static JDBCDAO instance = null;

    public static JDBCDAO getInstance() {
        if (instance == null) {
            instance = new JDBCDAO();
        }
        return instance;
    }

    @Override
    public ArrayList<MediaItem> getAllMediaItems() {
        return null;
    }

    @Override
    public MediaItem getSpecificMediaItemByID(String ID) {
        return null;
    }

    @Override
    public User getUser(String username, String password) {
        return null;
    }

    @Override
    public ArrayList<MediaItem> getUserItems(User user) {
        return null;
    }

    @Override
    public void updateItemData(MediaItem item) {

    }

    @Override
    public void addMediaItem(MediaItem item) {

    }

    @Override
    public void removeMediaItem(MediaItem item) {

    }
}
