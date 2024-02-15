package controller;

import java.util.concurrent.Semaphore;

public class ThreadCalcBD extends Thread {

		private int idOperacao;
		private Semaphore semaforo;

		public ThreadCalcBD (int idoperacao, Semaphore semaforo) {
			this.idOperacao = idoperacao;
			this.semaforo = semaforo;

		}

		@Override
		public void run() {
		     calculos();
//		  -----Inicio seção crítica-----
			try {
				semaforo.acquire();
				transacaoBD();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
//		  -----Fim seção crítica-------
			}

		}

		private void transacaoBD() {
		   if(idOperacao % 3 == 1) {
			   try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao + " Transação de BD por 1s");
			   
		    }
		   else if(idOperacao % 3 == 2) {
			   try {
					sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao +" Transação de BD por 1.5s");
		    }
		   else if(idOperacao % 3 == 0) {
			   try {
					sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao +" Transação de BD por 1.5s");
		    
		    }		
		}

		private void calculos() {

		  if(idOperacao % 3 == 1) {
			  float tempo = (float) ((Math.random() * 201) + 1000);
			  try {
					sleep((long) tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao +" Calculo por " + tempo/1000 +"s");
			   	   
		  }
		  else if(idOperacao % 3 == 2) {
			  float tempo = (float) ((Math.random() * 501) + 150);
			  try {
					sleep((long) tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao +" Calculo por " + tempo/1000 +"s");	   
		  }
		  else if(idOperacao % 3 == 0) {
			  float tempo = (float) ((Math.random() * 101) + 100);
			  try {
					sleep((long) tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("#"+idOperacao +" Calculo por " + tempo/1000 +"s");	   
		   }
			
		}


}
