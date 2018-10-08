package com.codecool.DAO;

import com.codecool.entity.MediaItem;
import com.codecool.entity.User;

import java.util.ArrayList;

public interface DAO {
    public ArrayList<MediaItem> getAllMediaItems();

    public MediaItem getSpecificMediaItemByID(int ID);

    public User getUser(String username, String password);

    public ArrayList<MediaItem> getUserItems(User user);

    public void updateItemData(MediaItem item);

    public void addMediaItem(MediaItem item);

    public void removeMediaItem(MediaItem item);

}
