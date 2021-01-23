package pl.sda.javalondek4.java_demo.lambda;

public class ClassForWorkLifeBalance implements WorkLifeBalance{
    @Override
    public void hardWork() {
        System.out.println("Working now");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Sleeping now");
    }
}
