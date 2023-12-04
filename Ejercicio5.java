/* EJERCICIO 5
Modifica el programa anterior para que el hilo principal no espere 4 segundos si no
que se espere a que acaben los dos hilos que crea. El hilo principal ha de mostrar por pantalla
cuando empieza y cuando acaba.
*/

class HiloEjercicio5 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Voy crear dos hilos y a esperar a que acaben.");
            HiloEspera1D hilo1 = new HiloEspera1D ();
            HiloEspera2D hilo2 = new HiloEspera2D ();
            hilo1.setName("hilo1");
            hilo2.setName("hilo2");
            hilo1.start();
            hilo2.start();
			hilo2.join();
		} catch (InterruptedException e) {
			System.out.println("Hilo creado interrumpido.");
			return;
		}
    
		System.out.println("Soy el hilo principal que va a acabar.");

	}
}

class HiloEspera1D extends Thread {
	@Override
	public void run() {
		System.out.println("soy el hilo 1 y voy a esperar 3 segundos.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Hilo 1 interrumpido.");
			return;
		}
		System.out.println("Soy el hilo1 que va a acabar.");

	}
}

class HiloEspera2D extends Thread {
	@Override
	public void run() {
		System.out.println("soy el hilo 2 y voy a esperar 5 segundos.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Hilo 2 interrumpido.");
			return;
		}
		System.out.println("Soy el hilo2 que va a acabar.");

	}
}

public class Ejercicio5 {
	public static void main(String args[]) {
		HiloEjercicio5 hilo = new HiloEjercicio5();
		hilo.start();
	}	
}
