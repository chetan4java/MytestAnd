package com.example.chetan.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try{

                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally{
                    Intent openStartingPoint= new Intent("com.example.chetan.test2.STARTINGPOINT");
                    startActivity(openStartingPoint);

                }

            }
            };
        timer.start();


    }
}
