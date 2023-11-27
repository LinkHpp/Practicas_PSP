class HiloEjercicio3 extends Thread {
	@Override
	public void run() {
		System.out.println("Soy el hilo creado que est� empezando.");
		try {
			System.out.println("Voy a esperar 3 segundos.");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Hilo creado interrumpido.");
			return;
		}
		System.out.println("Soy el hilo creado que va a acabar.");
	}
}

public class Ejercicio3 {
	public static void main(String args[]) {
		HiloEjercicio3 hilo = new HiloEjercicio3();
		hilo.start();
	}	
}