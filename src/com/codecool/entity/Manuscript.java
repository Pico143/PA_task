package com.codecool.entity;

public class Manuscript extends MediaItem implements Readable {
    private String author;

    public void readItem() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
