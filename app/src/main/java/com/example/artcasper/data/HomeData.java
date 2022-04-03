package com.example.artcasper.data;

import android.graphics.drawable.Drawable;

public class HomeData {

    public int imageId;
    public String txt;

    public HomeData(int imageId, String text) {

        this.imageId = imageId;
        this.txt = text;
    }
    public int getImage() {
        return imageId;
    }
    public void setImage(int image) {
        this.imageId = image;
    }
    public String getName() {
        return txt;
    }
    public void setName(String name) {
        this.txt = name;
    }
}
