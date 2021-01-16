package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {
    public static void main(String[] args) {

        LeszekRunner leszekRunner = new LeszekRunner();
        leszekRunner.walk();
        Runner runner = new LeszekRunner();
        runner.go();

        Runner annonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Announymous runner");

            }
        };
        annonymousRunner.go();




    }
}
