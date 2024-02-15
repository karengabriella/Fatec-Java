package controller;

import javax.swing.JOptionPane;

public class Fila{
	
	private int tamanho;
	private int fila[];
	private int itemremovido;

	public Fila() {
	  fila = new int [Integer.parseInt(JOptionPane.showInputDialog("Tamanho da Fila: "))];
	  tamanho = 0;
	  itemremovido = 0; 
	}
	
//-----Carregar elementos na fila int
	
	 public int[] adicionaFila(int num, String controle) {
			
			if(tamanho == fila.length) {
			  System.out.println("Fila Cheia!");
			  return fila;
			}
			else if(controle.contains("Fila")) {	
			  num = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
			  fila[tamanho] = num;
			  tamanho += 1;
              return adicionaFila(num, controle);
			}  
			else {
			  fila[tamanho] = num;
			  tamanho += 1; 
			}
			 return fila;
		}	
	 
	 
//---------Remoção de elementos na Fila	 
	 
	 public int removerFila() {
		 
		 if(tamanho == 0) {
	       System.out.println("Fila vazia!"); 
		 }
		 else {
		
	      itemremovido = this.fila[0];
	      
	      for(int i = 1; i<tamanho; i++) {
	    	this.fila[i-1] = this.fila[i]; 
	      }
	       this.fila[tamanho-1] = 0;
	       tamanho = tamanho-1;
		   System.out.println("Item removido: " + itemremovido);
		 }
		 return itemremovido;
	 }
	 
//-------Mostrar fila int 
	 
	 public void statusfilaint() {
		System.out.print("Fila = [");
		for(int mostrar : this.fila) {
			System.out.print(" " + mostrar);	
		}
		System.out.print(" ]");
	 }		 

//--------Verificar se fila está vazia
	 
	public int removerdaFila() {
	  if(tamanho == 0) {
	     System.out.println("Pilha Vazia!");
	  }
	  else {
		int removido = removerFila(); 
		return removido;
      }
	  return -1;
	}
		 
//--------Verificar se fila está cheia
		 
	public void carregarFila(int num, String param) {
	   if(tamanho == fila.length) {
		 System.out.println("Pilha Cheia!");
	    }
	   else {
		  adicionaFila(num, param);
	   }
    }
		
	 
}
