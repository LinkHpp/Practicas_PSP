/* EJERCICIO 6
Comprueba el funcionamiento de los hilos tipo daemon creando una copia del
ejercicio 4 y añadiendo un hilo nuevo que será de tipo daemon y esperará 20 segundos.
*/

class HiloEjercicio6 extends Thread {
	@Override
	public void run() {
		System.out.println(".");
		try {
			System.out.println("Voy crear dos hilos y a esperar 4 segundos.");
            HiloEspera1F hilo1 = new HiloEspera1F ();
            HiloEspera2F hilo2 = new HiloEspera2F ();
            HiloDa hiloDa = new HiloDa();
            hilo1.setName("hilo1");
            hilo2.setName("hilo2");
			hiloDa.setName("hiloDa");
            hiloDa.setDaemon(true);
			if(hiloDa.isDaemon()){
				System.out.println("Esta en modo Demonio");
			}
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

class HiloDa extends Thread {
	@Override
	public void run() {
		System.out.println("soy el "+getName()+" y voy a esperar 20 segundos.");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			System.out.println("Hilo "+getName()+" interrumpido.");
			return;
		}
		System.out.println("Soy el "+getName()+" que va a acabar.");

	}
}

class HiloEspera1F extends Thread {
	@Override
	public void run() {
		System.out.println("soy el "+getName()+" y voy a esperar 3 segundos.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(getName()+" interrumpido.");
			return;
		}
		System.out.println("Soy el "+getName()+" que va a acabar.");

	}
}

class HiloEspera2F extends Thread {
	@Override
	public void run() {
		System.out.println("soy el "+getName()+" y voy a esperar 5 segundos.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(getName()+" interrumpido.");
			return;
		}
		System.out.println("Soy el "+getName()+" que va a acabar.");

	}
}

public class Ejercicio6 {
	public static void main(String args[]) {
		HiloEjercicio6 hilo = new HiloEjercicio6();
		hilo.start();
	}	
}