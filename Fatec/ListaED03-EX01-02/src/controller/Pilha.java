package controller;

import javax.swing.JOptionPane;

public class Pilha{
	
	private int topo;
	private int pilha[];
	private int itemremovido;

	public Pilha() {
	  pilha = new int [Integer.parseInt(JOptionPane.showInputDialog("Tamanho da Pilha: "))];
	  topo = 0;
	  itemremovido = 0; 
	}
	
//-----Carregar elementos na pilha int
	
	 public int[] push(int param, String controle) {
		 
		if(topo == pilha.length) {
		  return pilha;
		}
		else if(controle.contains("Pilha")) {	
		  param = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
		  this.pilha[topo] = param;
		  this.topo += 1;
		  return push(param, controle); 
		}  
		else {
		  this.pilha[topo] = param;
		  this.topo += 1;	
		}
		return pilha;
	 }		
	 
	 
//---------Remoção de elementos na Pilha	 
	 
	 public int pop() {
		 
		 if(topo == 0) {
	       System.out.println("Pilha vazia!"); 
		 }
		 else {
		
	       itemremovido = this.pilha[topo-1];
	       pilha[topo-1] = 0;
	       topo = topo-1;
		   System.out.println("Item removido: " + itemremovido);
		 }
		 return itemremovido;
	 }
	 
//-------Mostrar pilha int 
	 
	 public void statuspilhaint() {
		System.out.println("Pilha \n ------");
		for(int mostrar : this.pilha) {
			System.out.println(" " + mostrar);	
		}
		System.out.println(" --------");
	 }		 
	 
//--------Verificar se pilha está vazia
	 
	 public int desempilhar() {
		 if(topo == 0) {
			  System.out.println("Pilha Vazia!");
		 }
		 else {
		   int itemremovido = pop();
		   return itemremovido;
	     }
		 return -1;
	  }
	 
//--------Verificar se pilha está cheia
	 
    public void carregarpilha(int num, String controle) {
		if(topo == pilha.length) {
		  System.out.println("Pilha Cheia!");
		}
	    else {
	      push(num, controle);
	    }
	}
		 
	 
}
