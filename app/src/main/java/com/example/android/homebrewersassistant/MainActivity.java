package com.example.android.homebrewersassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartSanitizingActivity(View view) {

        Intent SanitizingActivityIntent = new Intent(this, Sanitizing_Activity.class);
        startActivity(SanitizingActivityIntent);
    }

    public void StartBrewingActivity(View view) {

        Intent BrewingActivityIntent = new Intent(this, BrewingActivity.class);
        startActivity(BrewingActivityIntent);
    }


    public void StartFermentationActivity(View view) {

        Intent FermentationActivityIntent = new Intent(this, FermentationActivity.class);
        startActivity(FermentationActivityIntent);
    }


    public void StartBottlingActivity(View view) {

        Intent BottlingActivityIntent = new Intent(this, BottlingActivity.class);
        startActivity(BottlingActivityIntent);
    }


    public void StartDrinkingActivity(View view) {

        Intent DrinkingActivityIntent = new Intent(this, DrinkingActivity.class);
        startActivity(DrinkingActivityIntent);
    }

    public void StartabvActivity(View view) {

        Intent abvActivityIntent = new Intent(this, Sanitizing_Activity.class);
        startActivity(abvActivityIntent);
    }

}
