package view;

import java.util.concurrent.Semaphore;
import controller.Bilheteria;

public class Principal {
	public static void main(String[] args) {

		int validarcompra = 1;
		Semaphore semaforo = new Semaphore(validarcompra);
		for (int idComprador = 0; idComprador <= 300; idComprador++) {
			Thread vendaingressos = new Bilheteria(idComprador, semaforo);
			vendaingressos.start();
		}

	}

}
