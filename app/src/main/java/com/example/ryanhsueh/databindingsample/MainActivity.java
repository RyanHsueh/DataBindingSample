package com.example.ryanhsueh.databindingsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void activityStart(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

    public void startBasicActivity(View view) {
        activityStart(BasicActivity.class);
    }
    public void startObservableActivity(View view) {
        activityStart(ObservableActivity.class);
    }
}
