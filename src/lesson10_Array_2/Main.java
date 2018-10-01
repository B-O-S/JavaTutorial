package lesson10_Array_2;

public class Main {
    public static void main(String args[]) {
        int[][] m = {{1,4,6},{8,9},{2,5,3}};

//        for (int row = 0; row < m.length; row++) {
//            for (int col = 0; col < m[row].length; col++) {
//                System.out.print(m[row][col]+" ");
//                try {
//                    Thread.sleep(1500);
//                } catch (Exception e){}
//            }
//            System.out.println();
//        }
        for (int[] aM : m) {
            for (int anAM : aM) {
                System.out.print(anAM + " ");
                try {
                    Thread.sleep(1500);
                } catch (Exception ignored) {
                }
            }
            System.out.println();
        }
    }
}
