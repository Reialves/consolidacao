package com.example.myapplication.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.ExibirPdfActivity;
import com.example.myapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;
import java.util.ArrayList;

public class Estudos extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudos);
        listView = findViewById(R.id.listView);



        String[] estudosPdf = {"1º Estudo","2º Estudo","3º Estudo","4º Estudo","5º Estudo","6º Estudo","7º Estudo","Estudo de batismo e ceia"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, estudosPdf){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);
                return view;
            }
        };
            listView.setAdapter(adapter);
            listView.setOnItemClickListener((adapterView, view, i, l) ->  {

                String item = listView.getItemAtPosition(i).toString();

                Intent intent = new Intent(getApplicationContext(), ExibirPdfActivity.class);
                intent.putExtra("pdfFileName",item);
                startActivity(intent);

        });
    }
}