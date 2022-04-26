package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {


     AdView adview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //carregando anúncio
        adview = findViewById(R.id.adView);
        MobileAds.initialize(this, "ca-app-pub-6945563291857168~2829919108" );
        AdRequest adRequest = new AdRequest.Builder().build();
        adview.loadAd(adRequest);


    }
    public void telaCadastro(View view){
        Intent intent = new Intent(getApplicationContext(),Cadastro.class);
        startActivity(intent);
    }

    public void telaCadastroConsolidador (View view){
        Intent intent2 = new Intent(getApplicationContext(),CadastroConsolidadorActivity.class);
        startActivity(intent2);
    }
}
