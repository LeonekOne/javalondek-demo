package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {
    public static void main(String[] args) {

        LeszekRunner leszekRunner = new LeszekRunner();
        leszekRunner.walk();
        Runner runner = new LeszekRunner();
        handleRunner(runner);
//        runner.walk(); - doesn't compile

        Runner annonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Announymous runner");

            }
        };
        handleRunner(annonymousRunner);

        // call handleRunner user anonymous class
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        }
        );


    }

        public static void handleRunner(Runner anyRunner) {
            System.out.println("calling handleRunner()");

            anyRunner.go();
        }




}
