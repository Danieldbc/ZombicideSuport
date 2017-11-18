package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.app.LauncherActivity;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.shape;

public class PersonajesAdapter extends RecyclerView.Adapter<PersonajesAdapter.ViewHolder> implements View.OnClickListener{

    private List ListaPersonajes;
    private Context context;
    private View.OnClickListener listener;

    public PersonajesAdapter(Context c) {
        this.context = c;
        ListaPersonajes = new ArrayList();
    }

    public void add(personajes i) {
        ListaPersonajes.add(i);
        notifyItemInserted(ListaPersonajes.indexOf(i));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        final View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.personajes, parent, false);
        final ViewHolder vh = new ViewHolder(v);
        v.setOnClickListener(this);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final personajes item = (personajes) ListaPersonajes.get(position);
        holder.foto.setImageDrawable(item.getFoto());
        holder.nombre.setText(item.getNombre());
    }



    @Override
    public int getItemCount() {
        return ListaPersonajes.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected ImageView foto;
        protected TextView nombre;

        public ViewHolder(View v) {
            super(v);
            foto = (ImageView) v.findViewById(R.id.foto);
            nombre = (TextView) v.findViewById(R.id.nombre);
        }
    }
}




