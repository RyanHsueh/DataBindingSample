package com.example.ryanhsueh.databindingsample.model;

/**
 * Created by ryanhsueh on 2018/7/29
 */
public class Hero {

    private String name;
    private String level;

    public Hero(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
