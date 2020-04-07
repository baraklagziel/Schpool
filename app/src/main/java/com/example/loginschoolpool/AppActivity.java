package com.example.loginschoolpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * AppActivity class : The user can choose between:
 *                      1. To ride with school-pool
 *                      1. To drive with school-pool
 */
public class AppActivity extends AppCompatActivity {
    private Button  buttonRideInSchpool;
    private Button  buttonDriveInSchpool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        buttonRideInSchpool = (Button)findViewById(R.id.button_ride_in_schpool);
        buttonRideInSchpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRouteActivity();
            }
        });

    }
    private void openRouteActivity() {
        Intent intent  = new Intent(this, RouteActivity.class);
        startActivity(intent);
    }
}
