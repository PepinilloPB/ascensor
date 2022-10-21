package com.ucb.ascensor;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;

import org.junit.rules.ExpectedException;

import org.junit.Test;

import org.junit.Before;

 
//import org.junit.internal.runners.statements.ExpectException;

public class AscensorTest {
    
	@Rule

    public ExpectedException exception= ExpectedException.none();
    private Ascensor ascensor;

    @Before
    public void before(){
        ascensor = new Ascensor();
    }

    @Test
    public void alIniciarEnElPrimerPiso() throws Exception{
        ascensor.iniciar();
		//exception.expect(Exception.class);
        assertEquals(0, ascensor.getPiso());
        assertEquals(0, ascensor.getDestinos().size());
    }

    @Test
    public void cambioDeDireccion() throws Exception{
        int pisoInicial = ascensor.getPiso();
        ascensor.getDestinos().add(5);
        ascensor.moverse();
        assertNotEquals(ascensor.getPiso(), pisoInicial);
    }

    @Test
    public void cambioDeVariasDireccion() throws Exception{
        int pisoInicial = ascensor.getPiso();

        ascensor.getDestinos().add(4);
        ascensor.getDestinos().add(9);

        ascensor.moverse();
        assertNotEquals(ascensor.getPiso(), pisoInicial);

        pisoInicial = ascensor.getPiso();
        ascensor.moverse();
        assertNotEquals(ascensor.getPiso(), pisoInicial);
    }

    @Test
    public void ascensorSinDestinos() throws Exception{
        ascensor.getDestinos().clear();
        assertThrows(Exception.class, () -> ascensor.moverse());
    }
}