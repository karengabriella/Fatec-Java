package view;

import java.util.concurrent.Semaphore;
import controller.ThreadCalcBD;

public class Principal {
	public static void main(String[] args) {

		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int idOperacao = 0; idOperacao < 22; idOperacao++) {
			Thread op = new ThreadCalcBD(idOperacao, semaforo);
			op.start();
		}

	}

}
