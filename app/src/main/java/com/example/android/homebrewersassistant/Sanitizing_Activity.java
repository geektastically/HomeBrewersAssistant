package com.example.android.homebrewersassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Sanitizing_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitizing);


    }

    public void StartMainActivity(View view) {

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(MainActivityIntent);
    }

    public void StartBrewingActivity(View view) {

        Intent BrewingActivityIntent = new Intent(this, BrewingActivity.class);
        startActivity(BrewingActivityIntent);
    }

}
