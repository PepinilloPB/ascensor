package com.ucb.ascensor;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;

import org.junit.rules.ExpectedException;

import org.junit.Test;

import org.junit.Before;

public class EdificioTest {
    
    @Rule

    public ExpectedException exception= ExpectedException.none();

    private Ascensor ascensor;
    private Edificio edificio;

    @Before
    public void before(){
        ascensor = new Ascensor();
        edificio = new Edificio(ascensor);
    }

    @Test
    public void llamarAlAscensorAOtroPiso() throws Exception{
        int pisoInicial = edificio.getAscensor().getPiso();
        edificio.llamarAscensor(1);
        assertNotEquals(pisoInicial, edificio.getAscensor().getPiso());
    }

    @Test
    public void llamarAlAscensorAlMismoPiso() throws Exception{
        int pisoInicial = edificio.getAscensor().getPiso();
        edificio.llamarAscensor(0);
        assertEquals(pisoInicial, edificio.getAscensor().getPiso());
    }

    @Test
    public void seleccionarUnNuevoDestino() throws Exception{
        int pisoInicial = edificio.getAscensor().getPiso();
        edificio.seleccionarDestino(1);
        assertNotEquals(pisoInicial, edificio.getAscensor().getPiso());
    }

    @Test
    public void moverAUnaPersonaAlDestinoDeseado() throws Exception{
        int destino = 4;
        edificio.crearPersona(destino);
        assertEquals(destino, edificio.getAscensor().getPiso());
    }
}
