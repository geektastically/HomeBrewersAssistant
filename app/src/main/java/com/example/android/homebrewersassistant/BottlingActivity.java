package com.example.android.homebrewersassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BottlingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottling);
    }

    public void StartMainActivity(View view) {

        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(MainActivityIntent);
    }

    public void StartDrinkingActivity(View view) {

        Intent BottlingActivityIntent = new Intent(this, DrinkingActivity.class);
        startActivity(BottlingActivityIntent);
    }


}
