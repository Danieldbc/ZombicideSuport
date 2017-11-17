package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dani on 17/11/2017.
 */

public class PersonajesAdapter extends RecyclerView.Adapter<PersonajesAdapter.ViewHolder> {
    private ArrayList<personajes> modelPersonajes;

    public PersonajesAdapter(ArrayList<personajes> modelPersonajes){
        this.modelPersonajes=modelPersonajes;
    }

    @Override
    public PersonajesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.personajes, parent, false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PersonajesAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(modelPersonajes.get(position).getNombre());
        holder.foto.setImageDrawable(modelPersonajes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return modelPersonajes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private ImageView foto;
        public ViewHolder(View v) {
            super(v);
            nombre = (TextView) v.findViewById(R.id.nombre);
            foto=(ImageView) v.findViewById(R.id.foto);
        }
    }
}


