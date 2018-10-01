package lesson24_Constructor;

public class Main {
    public static void main(String[] args) {
        Birds bird = new Birds("Синиця", true);
//        bird.setCanFly(true);
//        bird.setName("Синиця");
        System.out.println(bird.getName());
        System.out.println(bird.isCanFly());
    }
}
