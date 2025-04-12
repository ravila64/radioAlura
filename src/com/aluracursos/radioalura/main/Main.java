// palabras reservadas en JAVA
// abstract, continue, for, new, switch, assert, default, goto, package,
// synchronized, class, public, static, void, if, else, while, return,
// try, catch, finally, extends, implements, int, interfaz, long, nativo.

package com.aluracursos.radioalura.main;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.PotCast;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("Forever");
        cancion.setCantante("Kiss");

        PotCast potCast = new PotCast();
        potCast.setPresentador("Gabriela Aguiar");
        potCast.setTitulo("Cafe.Tech");
        // canciones
        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            cancion.reproduce();
        }
        System.out.println("Total me gusta "+cancion.getTotalMeGusta());
        System.out.println("Total reproduciones "+cancion.getTotalReproducciones());
        //PostCast
        for (int i = 0; i < 75; i++) {
            potCast.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            potCast.reproduce();
        }
        System.out.println("Total me gusta "+potCast.getTotalMeGusta());
        System.out.println("Total reproduciones "+potCast.getTotalReproducciones());
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(potCast);
        favoritos.adiciona(cancion);

    }
}
