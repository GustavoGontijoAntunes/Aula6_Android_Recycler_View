package com.example.aula06_recyclerviewexemplo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    private List<Pessoa> pessoasAdp = new ArrayList<>();

    public Adaptador(List<Pessoa> pessoasAdp) {
        this.pessoasAdp = pessoasAdp;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);
        
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pessoa pessoa = pessoasAdp.get(position);
        holder.txtNome.setText(pessoa.getNome());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return pessoasAdp.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtNome;
        ImageView imgLike;
        int position;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txtNome);
            imgLike = itemView.findViewById(R.id.imgLike);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Selecionou " + pessoasAdp.get(position).getNome() + "!", Toast.LENGTH_SHORT).show();
                }
            });

            imgLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Você deu like!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}