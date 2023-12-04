/* EJERCICIO 6
Comprueba el funcionamiento de los hilos tipo daemon creando una copia del
ejercicio 4 y añadiendo un hilo nuevo que será de tipo daemon y esperará 20 segundos.
*/

class HiloEjercicio4 extends Thread {
	@Override
	public void run() {
		System.out.println(".");
		try {
			System.out.println("Voy crear dos hilos y a esperar 4 segundos.");
            HiloEspera1 hilo1 = new HiloEspera1 ();
            HiloEspera2 hilo2 = new HiloEspera2 ();
            HiloEspera1 hiloDa = new HiloEspera1();
            hilo1.setName("hilo1");
            hilo2.setName("hilo2");
            hiloDa.setDaemon(true);
            hilo1.start();
            hilo2.start();
            hiloDa.start();

			Thread.sleep(4000);
            
            hilo1.interrupt();
            hilo2.interrupt();
		} catch (InterruptedException e) {
			System.out.println("Hilo creado interrumpido.");
			return;
		}
    
		System.out.println("Soy el hilo principal que va a acabar.");

	}
}

class HiloEspera1 extends Thread {
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

class HiloEspera2 extends Thread {
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

public class Ejercicio6 {
	public static void main(String args[]) {
		HiloEjercicio4 hilo = new HiloEjercicio4();
		hilo.start();
	}	
}