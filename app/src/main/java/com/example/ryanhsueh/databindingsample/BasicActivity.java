package com.example.ryanhsueh.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ryanhsueh.databindingsample.databinding.BasicBinding;
import com.example.ryanhsueh.databindingsample.model.Hero;

import java.util.Date;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);

        Hero ironMan = new Hero("Iron man", "A");
        binding.setHero(ironMan);

        binding.setAuthor("Ryan");
        binding.setAge(33);
        binding.setMan(true);

        Hero spiderMan = new Hero("Spider man", "S");
        binding.setMyHero(spiderMan);

        binding.setDate(new Date());

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BasicActivity.this, "Button Next", Toast.LENGTH_SHORT).show();
            }
        });

        binding.imgApp.setImageResource(R.mipmap.ic_launcher);
    }
}
