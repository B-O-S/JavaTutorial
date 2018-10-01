package lesson22_Synchronized_Code_Block;

import java.util.ArrayList;
import java.util.Random;

class Worker1 {
    private ArrayList<Integer> list1 = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();
    private Random random = new Random();

    private synchronized void partOne() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
    }
    private /*synchronized*/ void partTwo() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
    }
    private void proceed() {
        for (int i=0; i<1000; i++) {
            partOne();
            partTwo();
        }
    }
    void start() {
        System.out.println("Починаємо…");
        long startTime = System.currentTimeMillis();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                proceed();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                proceed();
//            }
//        });
//        Thread t1 = new Thread(() -> proceed());
//        Thread t2 = new Thread(() -> proceed());
        Thread t1 = new Thread(this::proceed);
        Thread t2 = new Thread(this::proceed);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Витрачений час: " + (endTime - startTime) + "\n"
                + "Список 1: " + list1.size() + "\n"
                + "Список 2: " + list2.size() + "\n");
    }
}
