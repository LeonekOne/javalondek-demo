package pl.sda.javalondek4.java_demo.lambda;

// Functional Interface - ma jedną abstrakcyjną metodę
@FunctionalInterface
public interface Runner {

    void go();
    default void go(int speed) {
        System.out.println("My current speed is: " + speed);
    }
    static void walk() {
        System.out.println("static walk method");
    }
}
