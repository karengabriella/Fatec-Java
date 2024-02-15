package principal;
import javax.swing.JOptionPane;

import controller.*;

public class Principal {
	
static int opmenu;
static int retornoremovidos;

public static void main(String[] args) {
	
	
	
	
	 while(opmenu != 3){
	   opmenu = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Filas \n 2 - Pilhas \n 3 - Teste \n 4 - Encerrar  "));
	   if(opmenu == 4) {
		   break; 	 
	    }   
//------Menu de Opções Fila
	    else if(opmenu == 1) {
	    	 Fila operacao = new Fila();
		     int opc = 0;
		     while(opc != 3) {
			   opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir elementos na fila \n 2 - Remover elementos da fila \n 3 - Sair"));
			   switch (opc) {
		         case 1:
		           operacao.carregarFila(0, "Fila");
		           break;
			     case 2:
			       retornoremovidos = operacao.removerdaFila();
			       break;
			     case 3:
			       break;
			     default:
			      System.out.println("Opção Ivalida!");
		 	   }
		    }
		    operacao.statusfilaint();
		 }
//-----Menu Opções Pilha
	    else if(opmenu == 2) {
	    	Pilha op = new Pilha();
	    	 int opc = 0;
		     while(opc != 3) {
			   opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir elementos na Pilha \n 2 - Remover elementos da Pilha \n 3 - Sair"));
			   switch (opc) {
		         case 1:
		            op.carregarpilha(0, "Pilha");
		            break;
			     case 2:
			        op.desempilhar();
			        break;
			     case 3:
			       break;
			     default:
			      System.out.println("Opção Ivalida!");
		 	   }
		    }
		    op.statuspilhaint();
	    }
//-----Teste
	   else if(opmenu == 3) { 
		  int param = 0, opc = 0; 
		  Teste opteste = new Teste();
		  while(opc != 3) {
		    param = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir elementos na fila \n 2 - Remover elementos da fila \n 3 - Inserir elementos na Pilha "
		  		+ "\n 4 - Remover elementos da Pilha \n 5 - Visualizar Pilha \n 6 - Visualizar Fila \n 7 - Encerrar"));
		    if(param == 7) {
			   break;
		   }
		  opteste.operacaotroca(param);
		  }
	    }
//-----Error
	  else {
		System.out.println("Opção Invalida!");
	  }
	   
	   
   }   
  }	
 }

