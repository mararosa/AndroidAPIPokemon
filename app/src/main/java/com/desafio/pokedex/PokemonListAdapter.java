package com.desafio.pokedex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desafio.pokedex.models.Pokemon;

import java.util.ArrayList;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.ViewHolder> {

    private ArrayList<Pokemon> dataset;

    public PokemonListAdapter() {
        dataset = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pokemon p = dataset.get(position);
        holder.nameTextView.setText(p.getName());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView photoImageView;
        private TextView nameTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            photoImageView = itemView.findViewById(R.id.photoImagemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }
}
