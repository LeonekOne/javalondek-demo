package pl.sda.javalondek4.java_demo.optional.homework;

public class HomeUtils {

    public static void main(String[] args) {

        InductionPlate plyta1 = new InductionPlate("jakiś tekst");
        InductionPlate plyta2 = new InductionPlate(null);

        System.out.println(plyta1.getTextOnThePlate());
        System.out.println(plyta2.getTextOnThePlate());
    }
}
