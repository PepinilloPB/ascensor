package com.ucb.ascensor;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AscensorApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AscensorApplication.class, args);
		Ascensor ascensor = new Ascensor(0);
		ascensor.iniciar();
       
		Edificio edificio = new Edificio(10, ascensor);
		try{
			edificio.crearPersona(5);
		}catch(Exception e){
			
		}
	}

}
