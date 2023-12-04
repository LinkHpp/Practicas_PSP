/* EJERCICIO 8
Crea un programa que cree 10 hilos de manera recursiva, cada hilo creará un hilo hijo
y así sucesivamente. Cada hilo padre tiene que esperar a que su hijo acabe. El último hilo creado
ha de esperar 5 segundos. Todos los hilos han de informar de quién son, que van a empezar, que
van a esperar y que han acabado.
*/

public class Ejercicio8 {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Hilo principal: " + mainThread.getName());

        createAndStartThreads(10);
    }

    private static void createAndStartThreads(int threadsToCreate) {
        if (threadsToCreate > 0) {
            Thread newThread = new Thread(() -> {
                Thread currentThread = Thread.currentThread();
                System.out.println("Hilo creado: " + currentThread.getName());

                System.out.println("Hilo " + currentThread.getName() + " va a empezar.");

                //Crear hilo hijo recursivamente
                createAndStartThreads(threadsToCreate - 1);

                //Esperar al hilo hijo
                try {
                    System.out.println("Hilo " + currentThread.getName() + " va a esperar.");
                    Thread.sleep(1000); // Simula algún trabajo en el hilo actual
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hilo " + currentThread.getName() + " ha acabado.");
            });

            newThread.start();

            //Esperar a que el hilo hijo termine antes de continuar
            try {
                newThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            //Último hilo creado espera 5 segundos
            try {
                System.out.println("Último hilo creado. Esperando 5 segundos...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
