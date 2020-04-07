package com.example.loginschoolpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * RouteActivity class : The user need to decide which route he will choose to do :
 *                      1. school --->  home
 *                      1. home   --->  school
 */
public class RouteActivity extends AppCompatActivity implements View.OnClickListener {
    private Button setHomeButton;
    private Button setSchoolButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        setHomeButton = (Button) findViewById(R.id.button_set_home);
        setSchoolButton = (Button) findViewById(R.id.button_set_school);

        setHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(RouteActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
