package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adiciona(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo()+" Es uno de los favoritos");
        }else{
            System.out.println(audio.getTitulo()+" Tambien es un favorito");
        }
    }
}
