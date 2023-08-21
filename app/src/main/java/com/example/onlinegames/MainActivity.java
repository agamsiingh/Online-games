package com.example.onlinegames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    Button button;

    @SuppressLint("MissingInflatedId")
    private AdView mAdview;
    private AdView mAdview2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button button;

      button =findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent iNext;
              iNext = new Intent(MainActivity.this,online_gamesas.class);
              startActivity(iNext);




          }
      });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
        mAdview=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
        mAdview=findViewById(R.id.adView2);
        AdRequest adRequest2=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);




    }
}