package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LoginActivity extends AppCompatActivity {


    AdView adview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        adview3 = findViewById(R.id.adView3);
        MobileAds.initialize(this, "ca-app-pub-6945563291857168~2829919108" );
        AdRequest adRequest = new AdRequest.Builder().build();
        adview3.loadAd(adRequest);
    }
}
