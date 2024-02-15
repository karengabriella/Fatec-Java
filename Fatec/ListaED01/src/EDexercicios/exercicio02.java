//02 - Carregar um vetor [5] inteiro. 
//Enviar cada elemento para uma função e esta irá retornar o seu fatorial 
//que será armazenado em um outro vetor. Exibir os dados dos vetores.

package EDexercicios;
import java.util.Random;

  public class exercicio02 {
	public static void main(String[] args) {
		
	 Random aleatorios = new Random();
	 metodosrecursivos operacoes = new metodosrecursivos(); //classe de métodos resolutivos
	 
	
    	int valores[] = new int [5];
    	int fatoriais[] = new int[5];
        int i;
        for(i = 0; i<valores.length; i++){
           valores[i] = aleatorios.nextInt(15); //Valores aleatórios até 15
        }
	for(i = 0; i<valores.length; i++){
	   fatoriais[i] = operacoes.fatorial(valores[i]);
	}	
	for(i = 0; i<valores.length; i++){
	  System.out.println("Número:  " + valores[i]);
	  System.out.println("Fatorial:  " + fatoriais[i] + "!");	
	 }
  }
}
