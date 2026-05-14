package com.rrparedes.game.personaje;

import com.rrparedes.game.equipamiento.Armadura;
import com.rrparedes.game.estadisticas.Fuerza;

public class Gerrero {
    public String nombre;
    public Armadura armadura;
    public Fuerza fuerza;

    public Gerrero(String nombre, Armadura armadura, Fuerza fuerza) {
        this.nombre = nombre;
        this.armadura = armadura;
        this.fuerza = fuerza;
    }

    public void mostrarInfo() {
        System.out.println("Guerrero: " + nombre);
        System.out.println("Armadura de: " + armadura.material + " (Defensa: " + armadura.defensa + ")");
        System.out.println("Puntos de Fuerza: " + fuerza.nivelFuerza);
    }
}
