package pl.sda.javalondek4.java_demo.lambda.calculator;

import java.math.BigDecimal;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("Playing with calc lambdas");

        Adder<Integer> adder = (Integer a, Integer b) -> {
            return a + b;
        };

        Adder<Integer> adder2 = (first, second) -> {
            return first + second;
        };

        Adder<Integer> adder3 = (first, second) -> first + second;

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

        Subtraction<Integer> subtraction = (x, y) -> x - y;
        Multiplication<Integer> multiplication = (x, y) -> x * y;
        Division<Double> division = (x, y) -> x / y;

        Operation<Double> divisionOperation = (first, second) -> first / second;
        Operation<Double> divisionOperation2 = (first, second) -> first * second;

        myAdder.addWithCommend(5,10, "Should be 15");
    }







}
