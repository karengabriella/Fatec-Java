package view;
import java.util.Random;
import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		
	  int vet[] = new int [1000];
	  Random aleatorio = new Random();
	  
	  for(int i = 0; i < 1000; i++) {
		  vet[i] = aleatorio.nextInt(100);
	  }
	    
	  Thread escolha1 = new ThreadVetor(1, vet);
	  escolha1.start();
	  Thread escolha2 = new ThreadVetor(2, vet);
	  escolha2.start();
	  
	}
}


