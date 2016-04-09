package com.example.android.homebrewersassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FermentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fermentation);
    }

    public void StartBottlingActivity(View view) {

        Intent BottlingActivityIntent = new Intent(this, BottlingActivity.class);
        startActivity(BottlingActivityIntent);
    }

    public void StartMainActivity(View view) {

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(MainActivityIntent);
    }

}
