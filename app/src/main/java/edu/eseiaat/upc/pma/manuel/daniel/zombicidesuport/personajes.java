package edu.eseiaat.upc.pma.manuel.daniel.zombicidesuport;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by PortatilDani on 17/11/2017.
 */

public class personajes {
    public String nombre;
    public Drawable foto;
    private String habAzul, habAmarilla, habNaranjas[], habRojas[];

    public personajes(String nombre, Drawable foto, String habAzul, String habAmarilla, String[] habNaranjas, String[] habRojas) {
        this.nombre = nombre;
        this.foto = foto;
        this.habAzul = habAzul;
        this.habAmarilla = habAmarilla;
        this.habNaranjas = habNaranjas;
        this.habRojas = habRojas;
    }

    public personajes(String nombre, Drawable foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getHabAzul() {
        return habAzul;
    }

    public String getHabAmarilla() {
        return habAmarilla;
    }

    public String[] getHabNaranjas() {
        return habNaranjas;
    }

    public String[] getHabRojas() {
        return habRojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Drawable getFoto() {
        return foto;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }
}

