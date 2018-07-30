package com.example.ryanhsueh.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.ryanhsueh.databindingsample.databinding.ActivityRecyclerViewBinding;
import com.example.ryanhsueh.databindingsample.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private ActivityRecyclerViewBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mBinding.recycler.setLayoutManager(layoutManager);
        mBinding.recycler.setAdapter(new HeroAdapter(getAvangers()));
    }

    private List<Hero> getAvangers() {
        Hero ironMan = new Hero("Iron Man", "A");
        Hero spiderMand = new Hero("Spider Man", "S");
        Hero thor = new Hero("Thor", "SS");
        Hero hulk = new Hero("Hulk", "SS");

        List<Hero> avangers = new ArrayList<>();
        avangers.add(ironMan);
        avangers.add(spiderMand);
        avangers.add(thor);
        avangers.add(hulk);

        return avangers;
    }
}
