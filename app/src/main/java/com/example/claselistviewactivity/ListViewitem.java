package com.example.claselistviewactivity;

public class ListViewitem {

    private int imageResource;
    private String title;
    private int color;

    public ListViewitem(int imageResource, String title, int color) {
        this.imageResource = imageResource;
        this.title = title;
        this.color = color;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getColor() {
        return color;
    }
}
