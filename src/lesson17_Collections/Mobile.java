package lesson17_Collections;

public class Mobile {
    private int number;
    private String name;

    Mobile(int number, String name) {
        this.name = name;
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
