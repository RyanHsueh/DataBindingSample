package com.example.ryanhsueh.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ryanhsueh.databindingsample.databinding.ActivityObservableBinding;
import com.example.ryanhsueh.databindingsample.model.ObFHero;
import com.example.ryanhsueh.databindingsample.model.ObHero;

public class ObservableActivity extends AppCompatActivity {

    private ObHero ironMan;
    private ObFHero spiderMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);

        ironMan = new ObHero("Iron Man", "A");
        binding.setObHero(ironMan);

        spiderMan = new ObFHero("Spider Mane", "S");
        binding.setObfHero(spiderMan);

        binding.btUpdateObHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ironMan.setName("Iron Man Mark 46");
            }
        });

        binding.btUpdateObfHero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spiderMan.setName("Dark Spider Man");
            }
        });

        binding.btUpdataBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ironMan.setName("Iron Man");
            }
        });
    }
}
