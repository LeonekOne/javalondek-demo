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

        // using lambda - super happy ;)
        handleRunner(() -> System.out.println("inside lambda call")
        );

        // we're implementing method go() here
        Runner myFirstLambda = () -> {
        };
        // expresion has value, statement does not (void)
        Runner mySecondLambda = () -> {
            System.out.println("Inside my second lambda");
        };

        Runner myThirdLambda = () -> System.out.println("my third lambda");

        Runner myFourthLambda = () -> {
            System.out.println("my first text");
            System.out.println("my second text");
        };

        handleRunner(myFourthLambda);

        myFourthLambda.go();
        myFourthLambda.go(345);
        Runner.walk();


    }





    public static void handleRunner(Runner anyRunner) {
        System.out.println("calling handleRunner()");

        anyRunner.go();
    }
}
