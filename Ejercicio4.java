/* EJERCICIO 4
Crea un programa que cree dos hilos.
Después de empezar un hilo hijo debe esperar 3 segundos y el otro hilo hijo debe esperar 5
segundos.
El hilo principal después de crear a los dos hijos debe esperar 4 segundos.
Cada hijo debe de mostrar por pantalla su nombre y cuánto tiempo va a esperar.
Se puede forzar la interrupción de un hilo mediante el método interrupt(). (ver ejemplo en el
código siguiente).
*/

class HiloEjercicio4 extends Thread {
	@Override
	public void run() {
		System.out.println(".");
		try {
			System.out.println("Voy crear dos hilos y a esperar 4 segundos.");
            HiloEspera1 hilo1 = new HiloEspera1 ();
            HiloEspera2 hilo2 = new HiloEspera2 ();
            hilo1.setName("hilo1");
            hilo2.setName("hilo2");
            hilo1.start();
            hilo2.start();
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

public class Ejercicio4 {
	public static void main(String args[]) {
		HiloEjercicio4 hilo = new HiloEjercicio4();
		hilo.start();
	}	
}