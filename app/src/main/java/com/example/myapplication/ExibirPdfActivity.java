package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ExibirPdfActivity extends AppCompatActivity {

    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_pdf);

        myPdfView = findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1º Estudo")){

            myPdfView.fromAsset("estudo1.pdf").load();
        }
        if (getItem.equals("2º Estudo")){

            myPdfView.fromAsset("estudo2.pdf").load();
        }
        if (getItem.equals("3º Estudo")){

            myPdfView.fromAsset("estudo3.pdf").load();
        }
        if (getItem.equals("4º Estudo")){

            myPdfView.fromAsset("estudo4.pdf").load();
        }
        if (getItem.equals("5º Estudo")){

            myPdfView.fromAsset("estudo5.pdf").load();
        }
        if (getItem.equals("6º Estudo")){

            myPdfView.fromAsset("estudo6.pdf").load();
        }
        if (getItem.equals("7º Estudo")){

            myPdfView.fromAsset("estudo7.pdf").load();
        }
        if (getItem.equals("Estudo de batismo e ceia")){

            myPdfView.fromAsset("estudo_batismo_e_ceia.pdf").load();
        }
    }
}
