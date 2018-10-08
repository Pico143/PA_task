package com.codecool.entity;

import com.codecool.view.View;

public class Games extends MediaItem implements Playable {
    private String studio;

    private String publisher;

    private String genre;

    public void playItem() {
        View.getInstance().displayMessage("game was just played");
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
