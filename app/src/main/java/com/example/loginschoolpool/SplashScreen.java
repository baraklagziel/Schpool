package com.example.loginschoolpool;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * SplashScreen class : A splash screen  appears while a The school program is launching
 *                      and containing a logo of school-pool
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                synchronized (this) {
                    try {
                        wait(1300);
                        System.out.println("Thread waited for 1.3 seconds");
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        try {
            t.start();
            t.join();
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
