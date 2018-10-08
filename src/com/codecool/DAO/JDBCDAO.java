package com.codecool.DAO;

import com.codecool.entity.MediaItem;
import com.codecool.entity.User;

import java.util.ArrayList;

public class JDBCDAO implements DAO {

    private ArrayList<MediaItem> mediaItems;

    private static JDBCDAO instance = null;

    public static JDBCDAO getInstance() {
        if (instance == null) {
            instance = new JDBCDAO();
        }
        return instance;
    }

    private JDBCDAO() {
        this.mediaItems = new ArrayList<>();
    }

    @Override
    public ArrayList<MediaItem> getAllMediaItems() {
        return this.mediaItems;
    }

    @Override
    public MediaItem getSpecificMediaItemByID(int ID) {
        for (MediaItem item : this.mediaItems) {
            if (item.getID() == ID) {
                return item;
            }
        }
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
        // for now it does nothing, since we don't have DAO to send changes to, and object in list is modified directly
    }

    @Override
    public void addMediaItem(MediaItem item) {
        this.mediaItems.add(item);
    }

    @Override
    public void removeMediaItem(MediaItem item) {

    }
}
