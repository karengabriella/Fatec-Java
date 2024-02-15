package controller;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class CorridadeSapos extends Thread {
		
    int pulos;
	int sapo;
	static int i;
	static int podio[] = new int [5];
	public static Semaphore semaforo;	
	
   public CorridadeSapos(int sapo, Semaphore semaforo) {	
	  this.sapo = sapo;	
	  this.semaforo = semaforo;
	  
   }
		
	@Override
	public void run() {
		iniciarcorrida();
//		----se��o cr�tica-------
		try {
			semaforo.acquire();
			podio();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
		   semaforo.release();
		}
//		-----fim se��o cr�tica---
		mostrarpodio();
		
	}
		
		
    public void iniciarcorrida() {
    	Random aleatorio = new Random(); 	 
		while(pulos < 15) {
		  pulos += aleatorio.nextInt(15);
		  System.out.println("O Sapo " + sapo + " pulou " + pulos + "m");
	   }
     }	
	 
		public void podio() {
			System.out.println("O Sapo: " + sapo + "  Chegou ao Final!");
			podio[i] = sapo;
			i += 1;			
		}
		
		public void mostrarpodio() {
			if(i == podio.length) {
				 int posi��o = 0;
				 System.out.println();
				for(int placar : podio) {
					posi��o += 1;
					System.out.println(posi��o + " lugar Sapo -> " + placar);
				}
			}
		}
		  
}	
	
		

