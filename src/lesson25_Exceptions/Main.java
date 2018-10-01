package lesson25_Exceptions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Object> list = /*null*/new ArrayList<>();
//        list.add(new Object());
//        System.out.println(list.size());
//*********************************************************
        int[] array = new int[5];
        for (int i = 0; i < array.length/*+1*/; i++) {
            array[i] = i;
        }
//        for (int i = 0; i < array.length/*+1*/; i++) {
//        System.out.println(array[i]);
//        }
        for (int anArray : array) {
            System.out.println(anArray);
        }
//*********************************************************
//        recurse(10);
//    }
//    private static void recurse(int i) {
//        recurse(i);
    }
}
