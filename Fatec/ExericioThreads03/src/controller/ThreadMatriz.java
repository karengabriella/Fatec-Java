package controller;

public class ThreadMatriz extends Thread {
	
	int idmatriz;
	int soma;
	int matriz[][] = new int [3][5];
	
	
	public ThreadMatriz (int idmatriz, int matriz[][]) {	
	  this.idmatriz = idmatriz;
	  this.matriz = matriz;
		
	}
	
	
	@Override
	public void run() {
	
		somalinha();
	}
	
	
	public void somalinha() {

		 for(int j = 0; j < 5; j++) {	 
			 soma += matriz[idmatriz][j];	
		  }
		   
		  System.out.println("IdTd: #"+getId() + " Soma das Linhas: " + soma);
		  
	  } 

}
