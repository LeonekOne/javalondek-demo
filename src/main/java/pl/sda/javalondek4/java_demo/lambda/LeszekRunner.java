package pl.sda.javalondek4.java_demo.lambda;

public class LeszekRunner implements Runner {

    @Override
    public void go() {
        System.out.println("Run, Leszek, run!!!");
    }

    @Override
    public void go(int speed) {
        System.out.println("Leszek Speed is: " + speed);
    }

    void walk() {
        System.out.println("Walk Leszek...");
    }
}
