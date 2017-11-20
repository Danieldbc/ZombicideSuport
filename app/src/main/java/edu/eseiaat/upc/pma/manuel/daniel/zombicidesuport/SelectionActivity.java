package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SelectionActivity extends AppCompatActivity {


    private RecyclerView viewPersonajes;
    private List<personajes> listaPersonajes;
    private PersonajesAdapter adapterPersonajes;
    private LinearLayoutManager linlayoutmanager;
    private ImageView descripcionPersonaje;
    private TextView habAzul,habAmarilla, habNaranja1, habNaranja2, habRoja1, habRoja2,habRoja3;
    private CheckBox modoZombie;
    private int idPersonaje=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        descripcionPersonaje =(ImageView)findViewById(R.id.DescripcionPersonaje);
        habAzul=(TextView) findViewById(R.id.HabAzul);
        habAmarilla=(TextView)findViewById(R.id.HabAmarilla);
        habNaranja1=(TextView) findViewById(R.id.HabNaranja1);
        habNaranja2=(TextView) findViewById(R.id.HabNaranja2);
        habRoja1=(TextView) findViewById(R.id.HabRoja1);
        habRoja2=(TextView) findViewById(R.id.HabRoja2);
        habRoja3=(TextView) findViewById(R.id.HabRoja3);
        modoZombie=(CheckBox)findViewById(R.id.ModoZombie);

        viewPersonajes =(RecyclerView)findViewById(R.id.ListaPersonajes);
        linlayoutmanager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        viewPersonajes.setLayoutManager(linlayoutmanager);
        CrearPersonajes();
        adapterPersonajes =new PersonajesAdapter(this,listaPersonajes);
        viewPersonajes.setAdapter(adapterPersonajes);


        Watts();

        modoZombie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonajeSeleccionado();
            }
        });
        adapterPersonajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idPersonaje=viewPersonajes.getChildAdapterPosition(view);
                PersonajeSeleccionado();

            }
        });



    }

    private void PersonajeSeleccionado() {
        personajes p = listaPersonajes.get(idPersonaje);
        habAzul.setText(p.getHabAzul());
        if (idPersonaje==0){
            Watts();
        }
        if (idPersonaje==1){
            Joshua();
        }
        if (idPersonaje==2){
            Belle();
        }
        if (idPersonaje==3){
            Grindlock();
        }
        if (idPersonaje==4){
            Kim();
        }
        if (idPersonaje==5){
            Shannon();
        }
    }

    private void Shannon() {
        boolean q=modoZombie.isChecked();
        if (q==true) {
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pshannonzombie));
            habAzul.setText(R.string.DisparoABocajarro);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1accionADistanciaGratuita);
            habNaranja2.setText(R.string.Afortunada);
            habRoja1.setText(R.string.mas1dadoCombate);
            habRoja2.setText(R.string.mas1accionDeCombateGratuita);
            habRoja3.setText(R.string.Escurridiza);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pshannon));
            habAzul.setText(R.string.DisparoABocajarro);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1accionADistanciaGratuita);
            habNaranja2.setText(R.string.Afortunada);
            habRoja1.setText(R.string.mas1dadoCombate);
            habRoja2.setText(R.string.mas1accionDeCombateGratuita);
            habRoja3.setText(R.string.Escurridiza);
        }
    }

    private void Kim() {
        boolean q=modoZombie.isChecked();
        if (q==true) {
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pkimzombie));
            habAzul.setText(R.string.Afortunada);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.seisEnElDadoMas1DadoADistancia);
            habNaranja2.setText(R.string.Amano);
            habRoja1.setText(R.string.mas1accionDeCombateGratuita);
            habRoja2.setText(R.string.mas1alasTiradasDeCombate);
            habRoja3.setText(R.string.seisEnElDadoMas1DadoCuerpoACuerpo);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pkim));
            habAzul.setText(R.string.Afortunada);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.seisEnElDadoMas1DadoADistancia);
            habNaranja2.setText(R.string.Amano);
            habRoja1.setText(R.string.mas1accionDeCombateGratuita);
            habRoja2.setText(R.string.mas1alasTiradasDeCombate);
            habRoja3.setText(R.string.seisEnElDadoMas1DadoCuerpoACuerpo);
        }
    }

    private void Grindlock() {
        boolean q=modoZombie.isChecked();
        if (q==true) {
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pgrindlockzombie));
            habAzul.setText(R.string.Provocacion);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
            habNaranja2.setText(R.string.Escurridizo);
            habRoja1.setText(R.string.mas1AlDañoCuerpoACuerpo);
            habRoja2.setText(R.string.EsoEsTodoLoQueTienes);
            habRoja3.setText(R.string.seisEnElDadoMas1DadoDeCombate);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pgrindlock));
            habAzul.setText(R.string.Provocacion);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
            habNaranja2.setText(R.string.Escurridizo);
            habRoja1.setText(R.string.mas1AlDañoCuerpoACuerpo);
            habRoja2.setText(R.string.EsoEsTodoLoQueTienes);
            habRoja3.setText(R.string.seisEnElDadoMas1DadoDeCombate);
        }
    }

    private void Belle() {
        boolean q=modoZombie.isChecked();
        if (q==true){
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pbellezombie));
            habAzul.setText(R.string.mas1accionDeMovimientoGratuita);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1aLasTiradasADistancia);
            habNaranja2.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
            habRoja1.setText(R.string.mas1dadoCombate);
            habRoja2.setText(R.string.mas1accionDeMovimientoGratuita);
            habRoja3.setText(R.string.Ambidiestra);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pbelle));
            habAzul.setText(R.string.mas1accionDeMovimientoGratuita);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1aLasTiradasADistancia);
            habNaranja2.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
            habRoja1.setText(R.string.mas1dadoCombate);
            habRoja2.setText(R.string.mas1accionDeMovimientoGratuita);
            habRoja3.setText(R.string.Ambidiestra);

        }
    }

    private void Watts() {
        boolean q=modoZombie.isChecked();
        if (q==true) {
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pwattszombie));
            habAzul.setText(R.string.EmpezarConBateBeisbol);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1dadoCuerpoACuerpo);
            habNaranja2.setText(R.string.Empujon);
            habRoja1.setText(R.string.dosZonasPorAccionDeMovimiento);
            habRoja2.setText(R.string.mas1accionDeCombateGratuita);
            habRoja3.setText(R.string.mas1alasTiradasDeCombate);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pwatts));
            habAzul.setText(R.string.EmpezarConBateBeisbol);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1dadoCuerpoACuerpo);
            habNaranja2.setText(R.string.Empujon);
            habRoja1.setText(R.string.dosZonasPorAccionDeMovimiento);
            habRoja2.setText(R.string.mas1accionDeCombateGratuita);
            habRoja3.setText(R.string.mas1alasTiradasDeCombate);
        }
    }

    private void Joshua() {
        boolean q=modoZombie.isChecked();
        if (q==true) {
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pjoshuazombie));
            habAzul.setText(R.string.Socorrista);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1acciónDeCombateADistancia);
            habNaranja2.setText(R.string.mas1aLasTiradasCuerpoACuerpo);
            habRoja1.setText(R.string.mas1accionDeCombateGratuita);
            habRoja2.setText(R.string.mas1aLasTiradasADistancia);
            habRoja3.setText(R.string.LiderNato);
        }else{
            descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pjoshua));
            habAzul.setText(R.string.Socorrista);
            habAmarilla.setText(R.string.mas1accion);
            habNaranja1.setText(R.string.mas1acciónDeCombateADistancia);
            habNaranja2.setText(R.string.mas1aLasTiradasCuerpoACuerpo);
            habRoja1.setText(R.string.mas1accionDeCombateGratuita);
            habRoja2.setText(R.string.mas1aLasTiradasADistancia);
            habRoja3.setText(R.string.LiderNato);
        }
    }

    private void CrearPersonajes() {

        listaPersonajes.add(new personajes("Watts",getDrawable(R.drawable.pwattscara)));
        listaPersonajes.add(new personajes("Joshua",getDrawable(R.drawable.pjoshuacara)));
        listaPersonajes.add(new personajes("Belle",getDrawable(R.drawable.pbellecara)));
        listaPersonajes.add(new personajes("Grindlock",getDrawable(R.drawable.pgrindlockcara)));
        listaPersonajes.add(new personajes("Kim",getDrawable(R.drawable.pkimcara)));
        listaPersonajes.add(new personajes("Shannon",getDrawable(R.drawable.pshannoncara)));
        //sobran los siquientes(en el futuro habrá más personajes), son para ver si funciona el recyclerview
        listaPersonajes.add(new personajes("Grindlock",getDrawable(R.drawable.pgrindlockcara)));
        listaPersonajes.add(new personajes("Kim",getDrawable(R.drawable.pkimcara)));
        listaPersonajes.add(new personajes("Shannon",getDrawable(R.drawable.pshannoncara)));

    }
}

