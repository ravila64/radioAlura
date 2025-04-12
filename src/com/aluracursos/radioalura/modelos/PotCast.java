package com.aluracursos.radioalura.modelos;

public class PotCast extends Audio {
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalReproducciones()>=2000){
            return 9;
        }else {
            return 1;
        }
        //return super.getClasificacion();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }
}
