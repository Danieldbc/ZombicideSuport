package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class SelectionActivity extends AppCompatActivity {


    private RecyclerView viewPersonajes;
    private PersonajesAdapter adapter;
    private LinearLayoutManager linlayoutmanager;
    private ImageView descripcionPersonaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        descripcionPersonaje =(ImageView)findViewById(R.id.DescripcionPersonaje);

        viewPersonajes =(RecyclerView)findViewById(R.id.ListaPersonajes);
        linlayoutmanager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        viewPersonajes.setLayoutManager(linlayoutmanager);
        adapter=new PersonajesAdapter(this);
        viewPersonajes.setAdapter(adapter);

        CrearPersonajes();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonajeSeleccionado(view);

            }
        });



    }

    private void PersonajeSeleccionado(View view) {
        int d=viewPersonajes.getChildAdapterPosition(view);

        if (d==3){
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.calavera));
        }
    }

    private void CrearPersonajes() {

        adapter.add(new personajes("hola",getDrawable(R.drawable.calavera)));
        adapter.add(new personajes("hola2",getDrawable(R.drawable.tabla)));
        adapter.add(new personajes("hola3",getDrawable(R.drawable.ejemplo)));
        adapter.add(new personajes("hola4",getDrawable(R.drawable.rifle)));
        adapter.add(new personajes("hola5",getDrawable(R.drawable.madera)));
        adapter.add(new personajes("hola6",getDrawable(R.drawable.ladrillos)));
        adapter.add(new personajes("hola7",getDrawable(R.drawable.mancharoja)));
        adapter.add(new personajes("hola8",getDrawable(R.drawable.calavera)));
    }



}

