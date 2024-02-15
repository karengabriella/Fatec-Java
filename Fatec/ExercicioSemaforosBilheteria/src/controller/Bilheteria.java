package controller;
import java.util.concurrent.Semaphore;
import java.util.Random;
public class Bilheteria extends Thread{
	
	        Random aleatorios = new Random();
	        
            private static int ingressos = 100;
			private int idComprador;
			private Semaphore semaforo;

			public Bilheteria (int idComprador, Semaphore semaforo) {
				this.idComprador = idComprador;
				this.semaforo = semaforo;

			}

			@Override
			public void run() {
			     if(login()) { 
			       if(processoCompra()) {
                    // -----Inicio seção crítica-----
						   try {
						      semaforo.acquire();
						   	  validarcompra();
						   } catch (InterruptedException e) {
							  e.printStackTrace();
						    } finally {
							  semaforo.release();
                     //-----Fim seção crítica-------   
			              }
			     }
			   }
		   }

			

			private boolean login() {
				
				boolean seguir = true;
				int tempo = (int) ((Math.random() * 1951) + 50);
				try {
					sleep(tempo);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				if(tempo >= 1000){
	          
				 seguir = false;
				 System.out.println("Tempo de Espera Login atingido.");
				}
				else {
				  seguir = true;
				}
			    return seguir;	
			}
			
			private boolean processoCompra() {
				
				boolean seguir = true;
				int tempo = (int) ((Math.random() * 2001) + 1000);
				try {
					sleep(tempo);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				if(tempo >= 2500){
				 seguir = false;
				 System.out.println("Tempo de Espera Processamento de Compra Atingido.");
				}
				else {
				  seguir = true;
				}
			    return seguir;					
			 }

			private void validarcompra() {
				
				int compra = aleatorios.nextInt(4)+1;
				if(ingressos - compra >= 0) {
					ingressos -= compra;	
					System.out.println("Usuário: " + idComprador + " Você comprou " + compra + " Ingressos. Disponíveis para compra: " + ingressos);	
			     }
				else {
				 System.out.println("Usuário: " + idComprador + " Você não pode comprar " + compra + " Ingressos. Disponíveis para compra: " + ingressos);
				}
				 
			}
	}


