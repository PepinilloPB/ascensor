package com.ucb.ascensor;

import java.util.ArrayList;

public class Ascensor {

    private int piso;
    private ArrayList<Integer> destinos;

    public Ascensor(int piso) {
        this.piso = piso;
        this.destinos = new ArrayList<>();
    }

    public Ascensor(int piso, ArrayList<Integer> destinos) {
        this.piso = piso;
        this.destinos = destinos;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Integer> getDestinos() {
        return this.destinos;
    }

    public void setDestinos(ArrayList<Integer> destinos) {
        this.destinos = destinos;
    }

    public void iniciar(){
        this.piso = 0;
        this.destinos = new ArrayList<>();
    }

    public void moverse(){

        if(!destinos.iterator().hasNext())
            System.out.println("No hay destinos");

        if(destinos.iterator().next() == this.piso)
            System.out.println("No se puede mover al mismo piso");

        this.piso = destinos.get(0);
        System.out.println("Ascensor en piso " + this.piso);
        destinos.remove(0);
    } 
}
