package com.example.layner.listaexercicio3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCurvaAcentuadaEsquerda = findViewById(R.id.btCurvaAcentuadaEsquerda);
        Button btCurvaAcentuadaDireita = findViewById(R.id.btCurvaAcentuadaDireita);
        Button btRetornoFrente = findViewById(R.id.btRetornoFrente);
        Button btPare = findViewById(R.id.btPare);

        btCurvaAcentuadaEsquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        btCurvaAcentuadaDireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Correta. Parabéns!");
                tvResultado.setTextColor(Color.parseColor("#228B22"));

                //Transicao de Tela
                Intent itSegundaTela = new Intent(MainActivity.this, SegundaTela.class);
                startActivity(itSegundaTela);
            }
        });

        btRetornoFrente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        btPare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });
    }
}
