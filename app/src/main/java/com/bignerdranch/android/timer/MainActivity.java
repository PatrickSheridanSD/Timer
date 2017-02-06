package com.bignerdranch.android.timer;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //This piece of code sets up a timer
        new CountDownTimer(10000,1000){


            @Override
            public void onTick(long milliSecondsUntilDone) {
                //Countdown is counting down every second
                Log.i("Seconds left",String.valueOf(milliSecondsUntilDone /1000));
            }

            public void onFinish() {
                //countdown has finished (After 10 seconds)
                Log.i("Done", "Countdown finised");
            }
        }.start();

       /*

       //this piece of code used for implementing a piece of code on a timer

        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {

                //insert code to run every second

                Log.i("Runnable has run","NOW");

                handler.postDelayed(this, 1000);

            }
        };

        handler.post(run);
       */
    }

}
