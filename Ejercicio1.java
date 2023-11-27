import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
            HelloThread hilo = new HelloThread(); // Se crea un nuevo hilo de ejecución
            hilo.start(numero); // Se arranca el hilo creado anteriormente

            System.out.println("Hola desde el hilo principal!");
        } while (numero != 0);
            System.out.println("Proceso acabando");

        sc.close();
    }
}

class HelloThread extends Thread {
    public void start(int num) {

        System.out.println("Hola desde el hilo creado!");

        int fibo1, fibo2, i;

        System.out.println("Los " + num + " primeros términos de la serie de Fibonacci son:");

        fibo1 = 1;
        fibo2 = 1;

        System.out.print(fibo1 + " ");
        for (i = 2; i <= num; i++) {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}