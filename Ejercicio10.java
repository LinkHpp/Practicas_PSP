/* EJERCICIO 10
Crea una clase en Java que haga lo siguiente. El hilo principal escribirá en un
archivo llamado heroes.txt el texto “Heroes del Silencio - Sirena Varada” y a continuación creará
dos hilos. Una vez creados los dos hilos esperará a que los dos acaben antes de cerrar el archivo
de texto.
*/

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

    public static void main(String[] args) {
        //Escribir en el archivo desde el hilo principal
        writeToFile("heroes.txt", "Heroes del Silencio - Sirena Varada");

        //Crear dos hilos
        Thread thread1 = new Thread(() -> {
            //Tarea del primer hilo
            writeToFile("heroes.txt", "Hilo 1: Información adicional 1");
        });

        Thread thread2 = new Thread(() -> {
            //Tarea del segundo hilo
            writeToFile("heroes.txt", "Hilo 2: Información adicional 2");
        });

        //Iniciar los dos hilos
        thread1.start();
        thread2.start();

        try {
            //Esperar a que ambos hilos terminen antes de cerrar el archivo
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hilos han terminado. Archivo cerrado.");
    }

    private static synchronized void writeToFile(String fileName, String content) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(content + "\n");
            System.out.println("Escrito en el archivo: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}