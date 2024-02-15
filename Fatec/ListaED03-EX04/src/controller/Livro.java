package controller;
import javax.swing.JOptionPane;

public class Livro {
	
	private String título[];
	private int exemplares;
	private int livros[];
	private int tamanho;
	
   public Livro(){
	 livros = new int [Integer.parseInt(JOptionPane.showInputDialog("Limite da Lista de Livros: "))];
	 exemplares =  0;
	 título = new String [livros.length];
	 tamanho = 0;
   }
  
	
 //-----Carregar elementos na pilha int
 	
 	 public int[] inserirlivros() {
 		 
 	  
 		if(tamanho == livros.length) {
 		  System.out.println("Limite de Livros atingido!");
 		  return livros;
 		}
 		título[tamanho] = JOptionPane.showInputDialog("Título: ");
 		exemplares = Integer.parseInt(JOptionPane.showInputDialog("Quantidade exemplares: "));
 		livros[tamanho] = exemplares;
 		tamanho += 1;	
 		return inserirlivros();
 		
 	 }		
 	 
 	 
 //---------Remoção de elementos na Pilha	 
 	 
 	 public void removerlivros() {
 		
 		 if(tamanho == 0) {
 	       System.out.println("Nenhum Exemplar!"); 
 		 }
 		 else {
 		  JOptionPane.showMessageDialog(null, "Livro: " + título[0] + " Quantidade de exemplares removidos: " + livros[0]);
 		  for(int i = 1; i<tamanho; i++) {
 			    this.título[i-1] = this.título[i];
 		    	this.livros[i-1] = this.livros[i]; 
 		      }
 		       this.título[tamanho-1] = " ";
 		       this.livros[tamanho-1] = 0;
 		       tamanho = tamanho-1;

 		 }

 	 }
 	 
 //-------Mostrar pilha int 
 	 
 	 public void statuslista() {
 		int titulos = 0;
 		System.out.println("Exemplares na Lista: ");
 		for(int mostrar : this.livros) {
 			System.out.println(this.título[titulos] + " " + mostrar);
 			titulos += 1;
 		}
 	 }		 
}
