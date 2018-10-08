package com.codecool.entity;

public class Movie extends MediaItem implements Watchable {
    private String length;

    private String director;

    private String genre;

    public void watchItem () {

    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
