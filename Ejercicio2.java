import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many threads do you want to create?");
        int num = in.nextInt();
        System.out.println();

        for (int i = 0; i < num; i++) {
            NewThread thread = new NewThread();
            thread.setName("Thread " + (i + 1));
            thread.run();

        }

        in.close();
    }
}

class NewThread extends Thread {
    public void run() {
        System.out.println("Hey, I'm Starting!");
        System.out.println("Hello, I'm " + getName());
        System.out.println("I'm finishing!");
        System.out.println();

    }
}