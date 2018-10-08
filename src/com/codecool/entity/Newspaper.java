package com.codecool.entity;

import com.codecool.entity.Readable;

public class Newspaper extends MediaItem implements Readable {
    private String publisher;

    private int pages;

    @Override
    public void readItem() {

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
