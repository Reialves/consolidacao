package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.activity.LoginActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class CadastroConsolidadorActivity extends AppCompatActivity {

    private TextView souCadastrado;
    AdView adview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_consolidador);

        adview2 = findViewById(R.id.adView2);
        MobileAds.initialize(this, "ca-app-pub-6945563291857168~2829919108" );
        AdRequest adRequest = new AdRequest.Builder().build();
        adview2.loadAd(adRequest);

        souCadastrado = findViewById(R.id.textSouCadastrado);
    }

    public void telaLogin (View view){
        Intent intent3 = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent3);
    }
}
