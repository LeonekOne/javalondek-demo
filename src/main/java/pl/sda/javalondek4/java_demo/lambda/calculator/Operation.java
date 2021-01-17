package pl.sda.javalondek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Operation<T> {

    T operation(T first, T second);
}
