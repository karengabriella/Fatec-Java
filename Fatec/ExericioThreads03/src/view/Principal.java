package view;
import java.util.Random;
import controller.ThreadMatriz;

public class Principal {
 public static void main(String[] args) {
	
	  int matriz[][] = new int [3][5];
	  Random aleatorio = new Random();
	  
	  for(int i = 0; i < 3; i++) {
		 for(int j = 0; j < 5; j++) {
		    matriz[i][j] = aleatorio.nextInt(10);
		    
		 }
	  }
	   
	   for(int i = 0; i<3; i++) {
     	  Thread somamatriz = new ThreadMatriz(i, matriz);
		  somamatriz.start();
		
	  }
	 	   
	}  
}
	

