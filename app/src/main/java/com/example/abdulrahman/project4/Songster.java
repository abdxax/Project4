package com.example.abdulrahman.project4;

/**
 * Created by Abdulrahman on 27/03/18.
 */

public class Songster {
    private String name;
    private String Country;
    private int age;
    private String lastAlbom;
    private int image;
    private int id;
    private String dead;

    public Songster(String name, String country, int age, String lastAlbom, int image, int id, String dead) {
        this.name = name;
        Country = country;
        this.age = age;
        this.lastAlbom = lastAlbom;
        this.image = image;
        this.id = id;
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastAlbom() {
        return lastAlbom;
    }

    public void setLastAlbom(String lastAlbom) {
        this.lastAlbom = lastAlbom;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDead() {
        return dead;
    }

    public void setDead(String dead) {
        this.dead = dead;
    }
}
