package lesson24_Constructor;

class Birds {
    private String name;
    private boolean canFly;
    Birds(String name, boolean canFly) {
//        System.out.println("Hello world");
        this.name = name;
        this.canFly = canFly;
    }

    String getName() {
        return name;
    }
    boolean isCanFly() {
        return canFly;
    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public boolean isCanFly() {
//        return canFly;
//    }
//    public void setCanFly(boolean canFly) {
//        this.canFly = canFly;
//    }
}
