package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SelectionActivity extends AppCompatActivity {


    private RecyclerView ViewPersonajes;
    private RecyclerView.Adapter Adapter;
    private ArrayList<personajes> ListaPersonajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        ViewPersonajes =(RecyclerView)findViewById(R.id.ListaPersonajes);
        ViewPersonajes.isHorizontalScrollBarEnabled();
        ViewPersonajes.setHasFixedSize(true);
        ViewPersonajes.setLayoutManager(new LinearLayoutManager(this));
        Adapter = new PersonajesAdapter(getData());
        ViewPersonajes.setAdapter(Adapter);

    }

    private ArrayList<personajes> getData() {
       String nombre="hola";
        Drawable picture=getDrawable(R.drawable.calavera);
        ListaPersonajes.add(new personajes(nombre,picture));

        return ListaPersonajes;
    }
}

