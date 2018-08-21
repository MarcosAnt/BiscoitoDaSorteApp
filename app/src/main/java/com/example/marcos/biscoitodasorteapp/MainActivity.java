package com.example.marcos.biscoitodasorteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView output;
    List<FraseDaSorte> lista = new ArrayList<FraseDaSorte>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView) findViewById(R.id.output);
        output.setText("");

        lista.add(new FraseDaSorte("A vida trará coisas boas se tiveres paciência."));
        lista.add(new FraseDaSorte("Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você."));
        lista.add(new FraseDaSorte("Não compense na ira o que lhe falta na razão."));
        lista.add(new FraseDaSorte("Defeitos e virtudes são apenas dois lados da mesma moeda."));
        lista.add(new FraseDaSorte("A maior de todas as torres começa no solo."));
        lista.add(new FraseDaSorte("Não há que ser forte. Há que ser flexível."));
        lista.add(new FraseDaSorte("Gente todo dia arruma os cabelos, por que não o coração?"));
        lista.add(new FraseDaSorte("Há três coisas que jamais voltam: a flecha lançada, a palavra dita e a oportunidade perdida."));
        lista.add(new FraseDaSorte("A juventude não é uma época da vida, é um estado de espírito."));
        lista.add(new FraseDaSorte("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos."));
    }

    public void verSorte(View view) {
        Random r = new Random();
        int index = r.nextInt(10);
        FraseDaSorte frase = lista.get(index);
        output.setText(frase.getFrase());
    }
}
