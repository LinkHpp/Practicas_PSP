/* EJERCICIO 9
Crea una clase en Java que utilice 5 hilos hijos para contar el número de vocales
que hay en un determinado texto. Cada hilo se encargará de contar una vocal diferente. Todos
los hilos actualizan el número de vocales en una variable común. Hay que utilizar métodos
sincronizados para evitar condiciones de carrera.
*/

public class Ejercicio9 {

    private static int vowelCount = 0;

    public static void main(String[] args) {
        String text = "Ejemplo de texto para contar vocales en Java";

        //Crear e iniciar hilos para contar vocales
        Thread aThread = new Thread(() -> countVowels('a', text));
        Thread eThread = new Thread(() -> countVowels('e', text));
        Thread iThread = new Thread(() -> countVowels('i', text));
        Thread oThread = new Thread(() -> countVowels('o', text));
        Thread uThread = new Thread(() -> countVowels('u', text));

        aThread.start();
        eThread.start();
        iThread.start();
        oThread.start();
        uThread.start();

        //Esperar a que todos los hilos terminen
        try {
            aThread.join();
            eThread.join();
            iThread.join();
            oThread.join();
            uThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar el resultado
        System.out.println("Número total de vocales: " + vowelCount);
    }

    private static synchronized void countVowels(char vowel, String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = Character.toLowerCase(text.charAt(i));
            if (currentChar == vowel) {
                count++;
            }
        }

        System.out.println("Hilo " + Thread.currentThread().getName() + " ha contado " + count + " '" + vowel + "'");
        vowelCount += count;
    }
}
