package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("Playing with calc lambdas");

        Adder adder = (int a,int b) -> {
            return a + b;
        };

        Adder adder2 = (first, second) -> {
            return first + second;
        };

        Adder adder3 = (first, second) -> first + second;

        StrangeOne strangeOne = (int a,int b) -> {
            return a + b;
        };

        StringAdder stringAdder = (one, two) -> {
            return one.concat(two);
        };

        MyAdder myAdder = (first, second, comment) -> {
            System.out.println(comment);
            return first + second;
        };

        myAdder.addWithCommend(5,10, "Should be 15");

        Subtraction subtraction = (x, y) -> x - y;
        Multiplication multiplication = (x, y) -> x * y;
        Division division = (x, y) -> x / y;

    }







}
