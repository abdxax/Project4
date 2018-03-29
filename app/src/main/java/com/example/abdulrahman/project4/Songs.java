package com.example.abdulrahman.project4;

/**
 * Created by Abdulrahman on 29/03/18.
 */

public class Songs {
    private String song;
    private int year;
    private int image;

    public Songs(String song, int year,int image) {
        this.song = song;
        this.year = year;
        this.image=image;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
