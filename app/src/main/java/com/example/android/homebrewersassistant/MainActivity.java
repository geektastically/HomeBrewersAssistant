package com.example.android.homebrewersassistant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Menu button */
    public void ViewMenu(View view) {
        // Do something in response to button
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Sanitizing button */
    public void ViewSani(View view) {
        // Do something in response to button
        setContentView(R.layout.sanitizing);
    }

    /** Called to Navigate to Brewing */
    public void ViewBrewing(View view) {
        // Do something in response to button
        setContentView(R.layout.brewing);
    }

    /** Called when the user clicks the Fermentation button */
    public void ViewFerm(View view) {
        // Do something in response to button
        setContentView(R.layout.fermentation);
    }

    /** Called when the user clicks the Bottling button */
    public void ViewBottle(View view) {
        // Do something in response to button
        setContentView(R.layout.bottling);
    }

    /** Called when the user clicks the Drinking button */
    public void ViewDrink(View view) {
        // Do something in response to button
        setContentView(R.layout.drinking);
    }

    /** Called when the user clicks the ABV Formula button */
    public void ViewAbv(View view) {
        // Do something in response to button
        setContentView(R.layout.abv);
    }

}
