/* EJERCICIO 3
Crea un programa que cree un hilo. Este hilo mostrará su nombre e indicará que está
empezando. A continuación, se esperará 3 segundos. Antes de acabar deberá mostrar que va a
acabar.
*/

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