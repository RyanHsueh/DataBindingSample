package com.example.ryanhsueh.databindingsample.model;

import android.databinding.ObservableField;

/**
 * Created by ryanhsueh on 2018/7/29
 */
public class ObFHero {

    private ObservableField<String> name = new ObservableField<>();
    private ObservableField<String> level = new ObservableField<>();

    public ObFHero(String name, String level) {
        this.name.set(name);
        this.level.set(level);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableField<String> getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level.set(level);
    }
}
