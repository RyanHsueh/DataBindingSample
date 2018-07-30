package com.example.ryanhsueh.databindingsample;

import android.databinding.BindingConversion;

import com.example.ryanhsueh.databindingsample.model.Hero;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ryanhsueh on 2018/7/29
 */
public class Util {

    public static String getName(Hero hero) {
        return hero.getName();
    }

    @BindingConversion
    public static String convertDate(Date date) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

}
