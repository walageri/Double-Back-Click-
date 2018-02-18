package com.blogspot.programer27android.doublebackklik;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 boolean doubleclikforback = false;
    @Override
    public void onBackPressed() {
        if (doubleclikforback) {
            super.onBackPressed();
        }
        this.doubleclikforback =true;
        Toast.makeText(this, "please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleclikforback=false;
            }
        },2000);
    }
}
