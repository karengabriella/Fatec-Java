// 04 - Carregar uma matriz [4 x 4 inteiro]. Apresentar:
// - Soma dos valores no intervalo de 1 a 100
// - Quantidade de números impares entre 30 a 50
// - Quantidade de números divisíveis por 8
// - Quantidade de números ímpares divisíveis por 3
// - Fatorial do maior número informado na matriz

package EDexercicios;
import javax.swing.JOptionPane;
import java.util.Random;

public class exercicio04 {
public static void main(String[] args) {
    int i,j = 0;
    int ex4[][] = new int [4][4];
    Random aleatorios = new Random();
		
//--Carregando a Matriz
		
  System.out.print("Valores da Matriz = [ ");
  int mostrar;
  for(i=0; i<4; i++) {
     for(j=0; j<4; j++){
         ex4[i][j] =  aleatorios.nextInt(150);
         mostrar =  ex4[i][j];
         System.out.print(" " + mostrar);
      }
   }
   System.out.println(" ]");
		
//--Opções - Funções de Resolução  
	
      int opc = 0;
      while (opc != 6) {
         opc = Integer.parseInt(JOptionPane.showInputDialog((" \n 1 | Soma (1 a 100)  \n 2 | Quantidade de Impares (30 a 50) \n 3 | Divisiveis por 8  \n 4 | Quantidade Imp. Divisiveis por 3 \n 5 | Fatorial do Maior \n 6 | Ecerrar")));
	 switch (opc) {
	   case 1:
	      System.out.println(" \n Soma dos valores no intervalo de 1 a 100: " + soma(ex4,0));
	      break;
	   case 2:
	   	System.out.println(" Quantidade de Imapares no intervalo de 30 a 50: " + qtimpares(ex4,0));
	        break;
	   case 3:
	   	System.out.println(" Quantidade de Divisíveis por 8: " + qtdive8(ex4));
	        break;
	   case 4:
	   	System.out.println(" Quantidade de Imp.Divisíveis por 3: " + qtimpares3(ex4));
	        break;
	   case 5:
	   	System.out.println( "Fatorial: " + fatorial(fatmaior(ex4)) + "!");
	        break; 
	 }
      }	   
 }	
	
//---Soma dos valores entre 1 e 100
	
  public static int soma(int matriz[][],int aux){
      int i, j;
     for(i=0; i< matriz.length; i++){ 
       for(j=0; j< matriz.length; j++){
 	 if(matriz[i][j] > 1 && matriz[i][j] < 100){
 	   aux += matriz[i][j];
         }	
       }	
     }
     return aux;
  }
	
//---Quantidade de Impares 
	
 	public static int qtimpares(int matriz[][], int aux){
 		 int i, j;
 		 for(i=0; i< matriz.length; i++){ 
 		  for(j=0; j< matriz.length; j++){
 		    if(matriz[i][j] > 30 && matriz[i][j] < 50 && matriz[i][j] % 2 != 0){
 	          aux += 1;
 		    }	
 		 }	
       }
 	  return aux;
 	}
 	
//----Quantidade de números divisíveis por 8
 	
     public static int qtdive8(int matriz[][]){
	    int aux=0,i, j;
	   for(i=0; i< matriz.length; i++){ 
	     for(j=0; j< matriz.length; j++){
	        if(matriz[i][j] % 8 == 0){
	          aux += 1;
		 }	
	       }	
            }
	  return aux;
      }
 	
//---Quantidade de Impares divisiveis por 3 
 	
   public static int qtimpares3(int matriz[][]){
 	 int aux =0,i, j;
 	for(i=0; i< matriz.length; i++){ 
          for(j=0; j< matriz.length; j++){
 	      if(matriz[i][j] % 3 == 0 && matriz[i][j] % 2 != 0){
 	        aux += 1;
 	       }	
 	    }	
         }
       return aux;
     }
 	
 //---Fatorial maior número informado na Matriz
 	
  public static int fatmaior(int matriz[][]){
          int maior = 0, i=0, j=0;
 	  for(i=0; i< matriz.length; i++){ 
 	    for(j=0; j< matriz.length; j++){ 
 	 	 if(matriz[i][j] > maior){
 	 	     maior = matriz[i][j];
 	 	  }	    
 	      }
 	   }	  
          System.out.println("Maior valor: " + maior);
 	  return maior; 	 		  
  }
 	 	
 //---------Fatorial-EX-04	 
 
   public static double fatorial(double num){
 	  if(num == 0){
 	    return 1;
 	  }
 	  return num * fatorial(num-1);
   }		  
 	
 }


