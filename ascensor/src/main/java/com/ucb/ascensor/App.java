package com.ucb.ascensor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Ascensor ascensor = new Ascensor(0);
       ascensor.iniciar();
       
       Edificio edificio = new Edificio(10, ascensor);
       edificio.crearPersona(5);
    }
}
