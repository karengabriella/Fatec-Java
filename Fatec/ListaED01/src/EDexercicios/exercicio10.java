//Exercicio 10 - Receba um número inteiro. 
//Calcule e mostre a série de Fibonacci recursivamente até o
//número recebido

package EDexercicios;
import javax.swing.JOptionPane;

public class exercicio10 {
  public static void main(String[] args) {
     int termo;
     termo = Integer.parseInt(JOptionPane.showInputDialog(("Termo Fibonacci: ")));
     System.out.print("Sequência: ");
     fibonacci(termo,0,0,1); 	//Função Recursiva 		
  }  
    
//----------------
  public static int fibonacci(int num, int aux, int var1, int var2){
  	  
 	   if(num == 0)
 	     return aux;  
 	   else
 	    aux = var1 + var2;
 	    var1 = var2;
 	    var2 = aux;
 	    System.out.print(" " + aux);
 	    
 	   return fibonacci(num-1, aux, var1, var2);  
          }				
  }
