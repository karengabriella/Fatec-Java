package controller;

public class Teste {
	Fila opfila = new Fila();
	Pilha oppilha = new Pilha();
	private int item;
	
	public Teste(){
	 item = 0;	
	}
	
	public void operacaotroca(int param) {
		if(param == 1) {  
		 opfila.adicionaFila(param, "Fila");
		}
		else if(param == 3) {
		 oppilha.carregarpilha(param, "Pilha");	
		}
		else if(param == 2) {
		  item = opfila.removerdaFila();
		  oppilha.carregarpilha(item, "Teste");	
	    }
		else if(param == 4) {
		 item = oppilha.desempilhar();	
		 opfila.adicionaFila(item, "Teste");
		}
		else if(param == 5) {
		  oppilha.statuspilhaint();	
		}
		else if(param == 6) {
		  opfila.statusfilaint();
		}
				
	}
}
