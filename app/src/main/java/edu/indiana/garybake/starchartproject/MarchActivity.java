package edu.indiana.garybake.starchartproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
/*
    MarchActivity.java
    This is the java file for the March month of my StarChart app. It handles the rotation of the starchart via the seekbar

    Created by Gary Baker
    Created on 2/24/2019
    Last modified by Gary Baker
    Last modified on 3/1/2019

    This is for my final project in A290 Android
    It is part of StarChartProject and it refers to StarChartMainActivity.java and activity_star_chart_main.xml, strings.xml, and colors_xml

 */

public class MarchActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_march);

        //This is getting the back button and then setting it to listen for clicks
        View backButton = findViewById(R.id.back_img_btn);
        backButton.setOnClickListener(this);
        //this is capturing the view for the skyChart to later be rotated
        final View marchSkyChart = findViewById(R.id.imgview_March);

        //this is the seekbar that will be used to rotate the skyChart
        SeekBar rotationChanger = (SeekBar) findViewById(R.id.rotation_changer);

        //this is getting the information from the seekbar to rotate the skyChart
        rotationChanger.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                marchSkyChart.setRotation(progress);  //this is a simple way to change the rotation of a view. after scouring the internet for hours, I found this myself in AndroidStudio.
            }

            //these are methods that must be implemented for the seek bar listener but are not used.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }

    //This is the method that returns to the main menu when th back button is pressed
    public void onClick(View v)
    {
        switch (v.getId()) { //this is finding the thing that was clicked on
            case R.id.back_img_btn:  //if it was the back button
                Intent mainMenuIntent = new Intent(this, StarChartMainActivity.class);  //it returns it back to the main activity
                startActivity(mainMenuIntent);
                break;
            default:
                Intent defaultIntent = new Intent(this, StarChartMainActivity.class); //if they somehow give a different input iit does the same thing
                startActivity(defaultIntent);
        }
    }
}
