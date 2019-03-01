package edu.indiana.garybake.starchartproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

/*
    StarChartMainActivity.java
    This is the java file for the main screen of my StarChart app. It has a grid of buttons that go to each month.

    Created by Gary Baker
    Created on 2/24/2019
    Last modified by Gary Baker
    Last modified on 3/1/2019

    This is for my final project in A290 Android
    It is part of StarChartProject and it refers to every month's activity and activity_star_chart_main.xml, strings.xml, and colors_xml

 */

public class StarChartMainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_chart_main);


        //this is a bunch of creating the buttons from the main page and then setting the onclick listener to them so we can capture when they are clicked upon.
        View januaryButton = findViewById(R.id.btn_january);
        januaryButton.setOnClickListener(this);
        View februaryButton = findViewById(R.id.btn_february);
        februaryButton.setOnClickListener(this);
        View marchButton = findViewById(R.id.btn_march);
        marchButton.setOnClickListener(this);
        View aprilButton = findViewById(R.id.btn_april);
        aprilButton.setOnClickListener(this);
        View mayButton = findViewById(R.id.btn_may);
        mayButton.setOnClickListener(this);
        View juneButton = findViewById(R.id.btn_june);
        juneButton.setOnClickListener(this);
        View julyButton = findViewById(R.id.btn_july);
        julyButton.setOnClickListener(this);
        View augustButton = findViewById(R.id.btn_august);
        augustButton.setOnClickListener(this);
        View septemberButton = findViewById(R.id.btn_september);
        septemberButton.setOnClickListener(this);
        View octoberButton = findViewById(R.id.btn_october);
        octoberButton.setOnClickListener(this);
        View novemberButton = findViewById(R.id.btn_november);
        novemberButton.setOnClickListener(this);
        View decemberButton = findViewById(R.id.btn_december);
        decemberButton.setOnClickListener(this);
    }

    //this is the method that will detect which button is pressed.
    public void onClick(View v)
    {
        switch (v.getId())  //this is a switch case that changes with every button in the grid of buttons.
        {
            case R.id.btn_january:  //if january it opens the january activity it repeats this for the rest of the months in the grid
                Intent januaryIntent = new Intent(this, JanuaryActivity.class);
                startActivity(januaryIntent);
                break;
            case R.id.btn_february:
                Intent februaryIntent = new Intent(this, FebruaryActivity.class);
                startActivity(februaryIntent);
                break;
            case R.id.btn_march:
                Intent marchIntent = new Intent(this, MarchActivity.class);
                startActivity(marchIntent);
                break;
            case R.id.btn_april:
                Intent aprilIntent = new Intent(this, AprilActivity.class);
                startActivity(aprilIntent);
                break;
            case R.id.btn_may:
                Intent mayIntent = new Intent(this, MayActivity.class);
                startActivity(mayIntent);
                break;
            case R.id.btn_june:
                Intent juneIntent = new Intent(this, JuneActivity.class);
                startActivity(juneIntent);
                break;
            case R.id.btn_july:
                Intent julyIntent = new Intent(this, JulyActivity.class);
                startActivity(julyIntent);
                break;
            case R.id.btn_august:
                Intent augustIntent = new Intent(this, AugustActivity.class);
                startActivity(augustIntent);
                break;
            case R.id.btn_september:
                Intent septemberActivity = new Intent(this, SeptemberActivity.class);
                startActivity(septemberActivity);
                break;
            case R.id.btn_october:
                Intent octoberActivity = new Intent(this, OctoberActivity.class);
                startActivity(octoberActivity);
                break;
            case R.id.btn_november:
                Intent novemberActivity = new Intent(this, NovemberActivity.class);
                startActivity(novemberActivity);
                break;
            case R.id.btn_december:
                Intent decemberActivity = new Intent(this, DecemberActivity.class);
                startActivity(decemberActivity);
                break;

             default: Intent defaultIntent = new Intent(this, JanuaryActivity.class);  //I have the default to be set up to send to the january activity if they were to somehow give an invalid input
                 startActivity(defaultIntent);
                 break;



        }
    }
}
