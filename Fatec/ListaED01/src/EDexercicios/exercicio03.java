// 03 - Carregar um vetor [100] inteiros positivos ou negativos.
//Classificar este vetor em ordem crescente e apresentar os valores.

package EDexercicios;
import java.util.Random;

public class exercicio03 {
public static void main(String[] args) {
       
   Random aleatorios = new Random();				
   int valores[] = new int [100];
   int i;
   for(i = 0; i<valores.length; i++){
    valores[i] = aleatorios.nextInt(100)-50; //Valores aleatórios de -50 até 100
   }
   ordenacao(valores);
 }

//----ordenação de vetor  
		 
  public static void ordenacao(int vet[]){        
        int i, j, aux;
	for(i=0; i< (vet.length+1); i++){ 
	  for(j=1; j< vet.length; j++){
	     if(vet[j-1] >= vet[j]){    
		aux = vet[j-1];
	        vet[j-1] = vet[j];
	 	vet[j] = aux;
	      }          
	   }    
        }	      
       System.out.println("Valores Ordenados: ");
       for(i=0; i<vet.length; i++){
	  System.out.println( vet[i]);
       }				 
  }
	
}

