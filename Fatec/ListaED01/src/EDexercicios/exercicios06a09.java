//Exercicios:
//6) Receba um número inteiro. Calcule e mostre o seu fatorial recursivamente.
//7) Realize recursivamente a soma de todos os números de 1 a 100.
//8) Realize recursivamente a soma de todos os números pares de 1 a 200
//9) Realize recursivamente a soma de todos os números ímpares de 1 a 300

package EDexercicios;
import javax.swing.*;
import java.util.Random;
import EDexercicios.metodosrecursivos;

public class exercicios06a09 {
public static void main(String[] args) {
		
//----Chamada de métodos recursivos
  metodosrecursivos operacoes = new metodosrecursivos();  
  int opc = 0;
  while (opc != 10) {
    opc = Integer.parseInt(JOptionPane.showInputDialog((" \n Ex - 6 \n EX - 7 \n Ex - 8 \n Ex - 9 \n Ecerrar - 10")));
   switch (opc) {
    case 6:
      System.out.println("É igual a " + operacoes.fatorial(exercicio06())+"!");  //Chamada -> Fatorial de um número aleatório
      break;
    case 7:
       System.out.println("Soma de todos os números: " + operacoes.somatotal(100)); //Função Recursiva -> Exercício 7
       break;
    case 8:
       System.out.println("Soma dos pares de 1 a 200: " + operacoes.somapares(200,0)); //Função Recursiva -> Exercício 8
       break;
    case 9:
       System.out.println("Soma dos ímpares de 1 a 300: " + operacoes.somaimpares(5,0)); //Função Recursiva -> Exercício 9
       break;		
    }
  }
}
	 
//Exercício 06 -> Gerar número aleatório 
     public static int exercicio06() {
	   Random aleatorios = new Random();
	   int num;
	   num = aleatorios.nextInt(15); //Valores aleatórios até 15
	   System.out.println("Fatorial de " + num + "!");
	   return num;
    }

}
