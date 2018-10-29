package com.example.layner.listaexercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        ImageView ivCurvaDireita = findViewById(R.id.ivCurvaDireita);
        ImageView ivPermitidoEstacionar = findViewById(R.id.ivPermitidoEstacionar);
        ImageView ivAtAt = findViewById(R.id.ivAtAt);
        ImageView ivPare = findViewById(R.id.ivPare);

        Button btResponder = findViewById(R.id.btResponder);
        btResponder.setEnabled(false);

        ivCurvaDireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Correta. Clique no Botão 'RESPONDER'");
                tvResultado.setTextColor(Color.parseColor("#228B22"));
                Button btResponder = findViewById(R.id.btResponder);
                btResponder.setEnabled(true);
            }
        });

        ivPermitidoEstacionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        ivAtAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        ivPare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Opção Incorreta, tente outra vez!");
                tvResultado.setTextColor(Color.parseColor("#FF0000"));
            }
        });

        btResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvResultado = findViewById(R.id.tvResultado);
                tvResultado.setText("Parabéns!");
            }
        });
    }
}
