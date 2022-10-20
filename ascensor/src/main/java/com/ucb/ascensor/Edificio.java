package com.ucb.ascensor;

import java.util.Random;

public class Edificio {

    private int pisos;
    private Ascensor ascensor;

    public Edificio(Ascensor ascensor) {
        this.pisos = 10;
        this.ascensor = ascensor;
    }

    public Edificio(int pisos, Ascensor ascensor) {
        this.pisos = pisos;
        this.ascensor = ascensor;
    }

    public int getpisos() {
        return this.pisos;
    }

    public Ascensor getAscensor() {
        return this.ascensor;
    }

    public void setAscensor(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public void crearPersona(int destino) throws Exception{
        Random random = new Random();
        int number = random.nextInt(this.pisos);

        System.out.println("Persona en piso " + number);

        llamarAscensor(number);
        seleccionarDestino(destino);
    }

    public void seleccionarDestino(int destino) throws Exception{
        if(ascensor.getPiso() == destino)
            //System.out.println("Mismo piso");
            throw new Exception("No se puede ir al mismo piso");

        ascensor.getDestinos().add(0, destino);
        System.out.println(ascensor.getDestinos().toString());
        ascensor.moverse();
    };

    public void llamarAscensor(int number) throws Exception{
        ascensor.getDestinos().add(number);
        System.out.println(ascensor.getDestinos().toString());
        ascensor.moverse();
    }
}