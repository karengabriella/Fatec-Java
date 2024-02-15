package view;

import java.util.concurrent.Semaphore;

import controller.CorridadeSapos;

public class Principal {
    
	public static Semaphore semaforo;
	
	public static void main(String[] args) {
		
		semaforo = new Semaphore(1);
		
		for(int i = 0; i<5; i++) {
	     	  Thread corridadesapo = new CorridadeSapos(i, semaforo);
			  corridadesapo.start();		
	    }
		
		
	}

}
