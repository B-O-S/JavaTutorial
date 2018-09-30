package Lesson13_Threads;

import java.util.*;

class Running implements Runnable {

    private int time;
    private String name;


    Running(String name) {

        this.name = name;
        Random r = new Random();
        time = r.nextInt(999);

    }


    public void run() {
        System.out.printf("Поток %s спит %d миллисекунд\n", name, time);
        try{

            Thread.sleep(time);

        } catch(Exception ignored) {}
        System.out.printf("Поток %s проснулся и закончился\n", name);

    }
}
