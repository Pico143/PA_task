package com.codecool.entity;

public class Music extends MediaItem implements Audible {
    private String band;

    private String length;

    private String genre;

    public void listenItem() {

    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
