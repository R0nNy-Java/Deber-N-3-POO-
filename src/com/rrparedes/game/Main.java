package com.rrparedes.game;

import com.rrparedes.game.equipamiento.Armadura;
import com.rrparedes.game.estadisticas.Fuerza;
import com.rrparedes.game.habilidades.Combate;
import com.rrparedes.game.mascota.DragonPequeño;
import com.rrparedes.game.personaje.Gerrero;

public class Main {
    static void main() {
        Armadura Nederita = new Armadura("Nederita",150);
        Fuerza Fuerza1 = new Fuerza(80);
        Combate Espadachin = new Combate("Corte 3 replicas");
        DragonPequeño Draqqi = new DragonPequeño("Draqui");

        Gerrero Rodny = new Gerrero("Rony", Nederita, Fuerza1);

        Rodny.mostrarInfo();
        System.out.println("Mascota acompañante: " + Draqqi.nombre);
        System.out.println("Habilidad equipada: " + Espadachin.tipoAtaque);




    }
}
