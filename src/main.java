import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener, 33);
        worker.start();

    }
}
