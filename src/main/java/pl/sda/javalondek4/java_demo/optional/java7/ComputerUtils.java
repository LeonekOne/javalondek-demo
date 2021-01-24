package pl.sda.javalondek4.java_demo.optional.java7;

import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static String getGraphicsCardModelFirstNaiveApproach(Computer computer) {
        return computer.getGraphicsCard().getModel();
    }

    public static String getGraphicsCardGoodApproach(Computer computer) {
//        if(computer.getGraphicsCard() == null){
//            return null;
//        }
//        else{
//            if(computer.getGraphicsCard().getModel()==null){
//                return null;
//            }
//            else{
//                return computer.getGraphicsCard().getModel();
//            }
//        }
        String result = null;

        if (computer != null) {
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null ) {
                result = graphicsCard.getModel();
            }

        }
        return result;


//        String graphicsCard = computer != null : computer.model ? "No"
    }

    public static void main(String[] args) {
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 3080"));

        getGraphicsCardModelFirstNaiveApproach(withoutGraphicsCard);
        getGraphicsCardModelFirstNaiveApproach(withUnknownModel);
        getGraphicsCardModelFirstNaiveApproach(personalComputer);
    }
}