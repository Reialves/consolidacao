package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cadastro extends AppCompatActivity {

    private TextInputEditText campoNome, campoTelefone, campoDataNasc,
    campoEndereco, campoEnderecoNumero, campoCidade, campoBairro, campoDataConversao, campoCelula, campoLider;

    String escolaridade;

    private TextView resultado, textData;
    private RadioButton radioBtnFund, radioBtnMedio, radioBtnSup;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        componentesCadastro();


    }

    public void cadastrar (View view){
        String nome         = campoNome.getText().toString();
        String fone         = campoTelefone.getText().toString();
        String dataNasc     = campoDataNasc.getText().toString();
        String endereco     = campoEndereco.getText().toString();
        String numEndereco  = campoEnderecoNumero.getText().toString();
        String cidade       = campoCidade.getText().toString();
        String bairro       = campoBairro.getText().toString();
        String dataConversao= campoDataConversao.getText().toString();
        String celula       = campoCelula.getText().toString();
        String lider        = campoLider.getText().toString();
        radioButton();

        resultado.setText("Nome: " + nome + "\n Telefone: "+ fone  + "\n Nasc: " + dataNasc
    + "\n endereço: "+ endereco + ", " + numEndereco + "\n Cidade: " + cidade + ", " + bairro + "\n data conversão" + dataConversao +"\n Célula: " + celula + ", Líder: "+ lider + "\n Escolaridade: "
        + escolaridade);
        limpar();
        Toast.makeText(getApplicationContext(),"Cadastrado com sucesso",Toast.LENGTH_LONG).show();
    }

   public void radioButton (){



        if(radioBtnFund.isChecked()){
            escolaridade = "Ensino Fundamental";
        }
        else if(radioBtnMedio.isChecked()){
            escolaridade = "Ensino Médio";
        }
        else if(radioBtnSup.isChecked()){
            escolaridade = "Ensino Superior";
        }
    }
    public void limpar (){
        campoNome.setText("");
        campoTelefone.setText("");
        campoDataNasc.setText("");
        campoEndereco.setText("");
        campoEnderecoNumero.setText("");
        campoCidade.setText("");
        campoBairro.setText("");
        campoDataConversao.setText("");
        campoCelula.setText("");
        campoLider.setText("");


    }


    public void componentesCadastro (){
        campoNome           = findViewById(R.id.campoNome);
        campoTelefone       = findViewById(R.id.campoTelefone);
        campoDataNasc       = findViewById(R.id.campoDataNasc);
        campoEndereco       = findViewById(R.id.campoEndereco);
        campoEnderecoNumero = findViewById(R.id.campoEnderecoNumero);
        campoCidade         = findViewById(R.id.campoCidade);
        campoBairro         = findViewById(R.id.campoBairro);
        campoDataConversao  = findViewById(R.id.campoDataConversao);
        campoCelula         = findViewById(R.id.campoCelula);
        campoLider          = findViewById(R.id.campoLider);
        resultado           = findViewById(R.id.resultado);
        radioBtnFund        = findViewById(R.id.radioBtnFund);
        radioBtnMedio       = findViewById(R.id.radioBtnMedio);
        radioBtnSup         = findViewById(R.id.radioBtnSup);
        btnCadastrar        =findViewById(R.id.btnCadastrar);


        //chamando configuração de data atual
       campoDataConversao.setText(DateCustom.dataAtual());

        //criando a mascara para o campo telefone
        SimpleMaskFormatter simpleMaskFormatter = new SimpleMaskFormatter("(NN)NNNNN-NNNN");
        MaskTextWatcher maskTextWatcher = new MaskTextWatcher(campoTelefone, simpleMaskFormatter);
        campoTelefone.addTextChangedListener(maskTextWatcher);

        //criando máscara para o campo data nascimento
        SimpleMaskFormatter smf = new SimpleMaskFormatter("NN/NN/NNNN");
        MaskTextWatcher mtw = new MaskTextWatcher(campoDataNasc, smf);
        campoDataNasc.addTextChangedListener(mtw);

        //criando máscara para o campo data conversao
        MaskTextWatcher mtw2= new MaskTextWatcher(campoDataConversao, smf);
        campoDataConversao.addTextChangedListener(mtw2);

    }
}
