package lesson21_Synchronized;

public class Worker implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<2000; i++) {
            Main.increaseNumber();
        }
    }
}
