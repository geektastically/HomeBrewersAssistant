package com.example.android.homebrewersassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrewingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewing);
    }

    public void StartMainActivity(View view) {

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(MainActivityIntent);
    }

    public void StartFermentationActivity(View view) {

        Intent FermentationActivityIntent = new Intent(this, FermentationActivity.class);
        startActivity(FermentationActivityIntent);
    }
}
