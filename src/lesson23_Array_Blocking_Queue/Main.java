package lesson23_Array_Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
//    private static ArrayList<Object> list = new ArrayList<>();
    private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<>(1000);

    public static void main(String[] args) {
        addObjects();
        proceed();
    }

//    private static void proceed() {
//        System.out.println(list.size());
//        while (list.size() != 0) {
//            Object obj = null;
//            for (Object element : list) {
//                obj = element;
//                break;
//            }
//            list.remove(obj);
//        }
//        System.out.println(list.size());
//    }
    private static void proceed() {
        System.out.println(list.size());
        for (Object element : list) {
            list.remove(element);
        }
        System.out.println(list.size());
    }

    private static void addObjects() {
        for (int x=0; x<5; x++) {
            list.add(new Object());
        }
    }
}
