package controller;


public class ThreadVetor extends Thread {

	int valor;
	int vet[] = new int [1000];
	
	
	public ThreadVetor(int valor, int vet[]) {	
	  this.valor = valor;
	  this.vet = vet;
		
	}
	
	
	@Override
	public void run() {
	
		opc();
	}
	
	
	public void opc() {
		
		if(valor % 2 != 0 && valor != 2) {
		  percorrervetorimpar();
		}
		  else {
			 percorrervetorpar();
		}			  
	}
	
	
	public void percorrervetorpar() {

	    double tempoinicial = System.nanoTime();
		 for(int i = 0; i < vet.length; i++) {	 
		  }
		  double tempofinal = System.nanoTime();
		  double tempototal = tempofinal - tempoinicial;
		  //Nanoseg = 10^-9s
		  tempototal = tempototal/Math.pow(10, 9);	  
		  System.out.println("Tempo percorrendo vetor com length -> " + tempototal  + "s");
	  }
	 
	 public void percorrervetorimpar() {

	     double tempoinicial = System.nanoTime();
		 for(int vetor : vet) {	 
		  }
		  double tempofinal = System.nanoTime();
		  double tempototal = tempofinal - tempoinicial;
		  //Nanoseg = 10^-9s
		  tempototal = tempototal/Math.pow(10, 9);	  
		  System.out.println("Tempo percorrendo vetor com foreach -> " + tempototal  + "s");
	  }
	
	
}
	

