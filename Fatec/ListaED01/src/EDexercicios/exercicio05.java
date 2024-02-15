//----Matriz de dados na diagonal 

package EDexercicios;
import javax.swing.JOptionPane;
public class exercicio05 {
public static void main(String[] args) {
     int i = 0,j = 0, aux = 1;
     int ex5[][] = new int [4][4];
	
     for(i= 0; i<4; i++){	
	 for(j =0; j<4; j++){
	    if(i==j){
	        ex5[i][j] = aux;
		aux = aux * 3;
	      }
	      else if(i != j){   
		 ex5[i][j] = Integer.parseInt(JOptionPane.showInputDialog(("Digite um número: "))); 
	       }
	   }
        }
        System.out.print("Valores da Matriz = \n [ ");
        for(i=0; i<4; i++) {
          System.out.print("\n");
          for(j= 0; j<4; j++){
	    System.out.print(" "+ ex5[i][j]);
           }
         } 
         System.out.println(" ]");
    }
}
