package com.example.ryanhsueh.databindingsample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.ryanhsueh.databindingsample.BR;

/**
 * Created by ryanhsueh on 2018/7/29
 */
public class ObHero extends BaseObservable {

    private String name;
    private String level;

    public ObHero(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }

}
