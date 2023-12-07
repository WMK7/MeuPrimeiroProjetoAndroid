package com.example.meuprimeiroprojetoandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Random;

public class MainActivity extends AppCompatActivity {


    String[] frases = {"Frase01", "Frase02", "Frase03", "Frase04"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(4);
        String frase = frases [numeroAleatorio];
        texto.setText(frase);

    }

    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases) {
            System.out.println(frase);
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);

    }
}
