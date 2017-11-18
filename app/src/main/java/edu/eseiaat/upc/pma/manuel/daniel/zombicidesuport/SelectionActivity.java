package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {


    private RecyclerView viewPersonajes;
    private PersonajesAdapter adapter;
    private LinearLayoutManager linlayoutmanager;
    private ImageView descripcionPersonaje;
    private TextView habAzul,habAmarilla, habNaranja1, habNaranja2, habRoja1, habRoja2,habRoja3;


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

        viewPersonajes =(RecyclerView)findViewById(R.id.ListaPersonajes);
        linlayoutmanager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        viewPersonajes.setLayoutManager(linlayoutmanager);
        adapter=new PersonajesAdapter(this);
        viewPersonajes.setAdapter(adapter);

        CrearPersonajes();
        Watts();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonajeSeleccionado(view);

            }
        });



    }

    private void PersonajeSeleccionado(View view) {
        int d=viewPersonajes.getChildAdapterPosition(view);

        if (d==0){
            Watts();
        }
        if (d==1){
            Joshua();
        }
        if (d==2){
            Belle();
        }
        if (d==3){
            Grindlock();
        }
        if (d==4){
            Kim();
        }
        if (d==5){
            Shannon();
        }
    }

    private void Shannon() {
        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pshannon));
        habAzul.setText(R.string.DisparoABocajarro);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.mas1accionADistanciaGratuita);
        habNaranja2.setText(R.string.Afortunada);
        habRoja1.setText(R.string.mas1dadoCombate);
        habRoja2.setText(R.string.mas1accionDeCombateGratuita);
        habRoja3.setText(R.string.Escurridiza);
    }

    private void Kim() {
        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pkim));
        habAzul.setText(R.string.Afortunada);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.seisEnElDadoMas1DadoADistancia);
        habNaranja2.setText(R.string.Amano);
        habRoja1.setText(R.string.mas1accionDeCombateGratuita);
        habRoja2.setText(R.string.mas1alasTiradasDeCombate);
        habRoja3.setText(R.string.seisEnElDadoMas1DadoCuerpoACuerpo);
    }

    private void Grindlock() {
        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pgrindlock));
        habAzul.setText(R.string.Provocacion);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
        habNaranja2.setText(R.string.Escurridizo);
        habRoja1.setText(R.string.mas1AlDañoCuerpoACuerpo);
        habRoja2.setText(R.string.EsoEsTodoLoQueTienes);
        habRoja3.setText(R.string.seisEnElDadoMas1DadoDeCombate);
    }

    private void Belle() {
        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pbelle));
        habAzul.setText(R.string.mas1accionDeMovimientoGratuita);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.mas1aLasTiradasADistancia);
        habNaranja2.setText(R.string.mas1accionDeCombateCuerpoACuerpoGratuita);
        habRoja1.setText(R.string.mas1dadoCombate);
        habRoja2.setText(R.string.mas1accionDeMovimientoGratuita);
        habRoja3.setText(R.string.Ambidiestra);
    }

    private void Watts() {
        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pwatts));
        habAzul.setText(R.string.EmpezarConBateBeisbol);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.mas1dadoCuerpoACuerpo);
        habNaranja2.setText(R.string.Empujon);
        habRoja1.setText(R.string.dosZonasPorAccionDeMovimiento);
        habRoja2.setText(R.string.mas1accionDeCombateGratuita);
        habRoja3.setText(R.string.mas1alasTiradasDeCombate);
    }

    private void Joshua() {

        descripcionPersonaje.setImageDrawable(getDrawable(R.drawable.pjoshua));
        habAzul.setText(R.string.Socorrista);
        habAmarilla.setText(R.string.mas1accion);
        habNaranja1.setText(R.string.mas1acciónDeCombateADistancia);
        habNaranja2.setText(R.string.mas1aLasTiradasCuerpoACuerpo);
        habRoja1.setText(R.string.mas1accionDeCombateGratuita);
        habRoja2.setText(R.string.mas1aLasTiradasADistancia);
        habRoja3.setText(R.string.LiderNato);
    }

    private void CrearPersonajes() {

        adapter.add(new personajes("Watts",getDrawable(R.drawable.pwattscara)));
        adapter.add(new personajes("Joshua",getDrawable(R.drawable.pjoshuacara)));
        adapter.add(new personajes("Belle",getDrawable(R.drawable.pbellecara)));
        adapter.add(new personajes("Grindlock",getDrawable(R.drawable.pgrindlockcara)));
        adapter.add(new personajes("Kim",getDrawable(R.drawable.pkimcara)));
        adapter.add(new personajes("Shannon",getDrawable(R.drawable.pshannoncara)));
        //sobran los siquientes(en el futuro habrá más personajes), son para ver si funciona el recyclerview
        adapter.add(new personajes("Grindlock",getDrawable(R.drawable.pgrindlockcara)));
        adapter.add(new personajes("Kim",getDrawable(R.drawable.pkimcara)));
        adapter.add(new personajes("Shannon",getDrawable(R.drawable.pshannoncara)));

    }



}

