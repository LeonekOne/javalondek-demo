package pl.sda.javalondek4.java_demo.optional.homework;

import java.util.Optional;

public class InductionPlate {

    private String textOnThePlate;

    public InductionPlate(String textOnThePlate) {
        this.textOnThePlate = textOnThePlate;
    }

    public Optional<String> getTextOnThePlate() {
        return Optional.ofNullable(textOnThePlate);
    }

    @Override
    public String toString() {
        return "InductionPlate{" +
                "textOnThePlate='" + textOnThePlate + '\'' +
                '}';
    }
}
