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
}
