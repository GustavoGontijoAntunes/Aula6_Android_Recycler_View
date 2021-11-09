package com.example.aula06_recyclerviewexemplo.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.aula06_recyclerviewexemplo.Adaptador;
import com.example.aula06_recyclerviewexemplo.Pessoa;
import com.example.aula06_recyclerviewexemplo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Pessoa> pessoasList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Configuro o tipo de layout a ser utilizado no meu Recycler View
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        criarPessoas();
        // Atribuir adaptador ao RecyclerView
        Adaptador adaptador = new Adaptador(pessoasList);
        recyclerView.setAdapter(adaptador);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
    }

    void criarPessoas(){
        Pessoa p;
        p = new Pessoa("Gustavo");
        pessoasList.add(p);

        p = new Pessoa("João");
        pessoasList.add(p);

        p = new Pessoa("Antônio");
        pessoasList.add(p);

        p = new Pessoa("Maria");
        pessoasList.add(p);

        p = new Pessoa("Ana");
        pessoasList.add(p);

        p = new Pessoa("Paula");
        pessoasList.add(p);

        p = new Pessoa("Fabiana");
        pessoasList.add(p);

        p = new Pessoa("Leo");
        pessoasList.add(p);
    }
}