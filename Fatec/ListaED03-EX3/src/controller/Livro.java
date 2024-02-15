package controller;
import javax.swing.JOptionPane;
public class Livro {
	
	private String título[];
	private int exemplares;
	private int livros[];
	private int topo;
	
   public Livro(){
	 livros = new int [Integer.parseInt(JOptionPane.showInputDialog("Limite da Pilha de Livros: "))];
	 exemplares =  0;
	 título = new String [livros.length];
	 topo = 0;
   }
  
	
 //-----Carregar elementos na pilha int
 	
 	 public int[] push() {
 		 
 	  
 		if(topo == livros.length) {
 		  System.out.println("Limite de Livros atingido!");
 		  return livros;
 		}
 		título[topo] = JOptionPane.showInputDialog("Título: ");
 		exemplares = Integer.parseInt(JOptionPane.showInputDialog("Quantidade exemplares: "));
 		livros[topo] = exemplares;
 		topo += 1;	
 		return push();
 		
 	 }		
 	 
 	 
 //---------Remoção de elementos na Pilha	 
 	 
 	 public void pop() {
 		
 		 if(topo == 0) {
 	       System.out.println("Nenhum Exemplar!"); 
 		 }
 		 else {
 		   JOptionPane.showMessageDialog(null, "Livro: " + título[topo-1] + " Quantidade de exemplares removidos: " + livros[topo-1]);
           título[topo-1] = " ";
           livros[topo-1] = 0;
 	       topo = topo-1;

 		 }

 	 }
 	 
 //-------Mostrar pilha int 
 	 
 	 public void statuspilha() {
 		int titulos = 0;
 		System.out.println("Exemplares na pilha: ");
 		for(int mostrar : this.livros) {
 			System.out.println(this.título[titulos] + " " + mostrar);
 			titulos += 1;
 		}
 	 }		 
 	 

 		 
 	 
 }  
   
   
   
  
