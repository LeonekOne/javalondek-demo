package pl.sda.javalondek4.java_demo.exception;

import java.util.Random;

public class ExceptionGenerator {

    /**
     *
     * @return
     * @throws NoNickCheckedException
     */
    public String nick() throws NoNickCheckedException {
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0) {
            return "leonek";
        } else {
            throw new NoNickCheckedException("I have no nick... yep!");
        }
    }

    public String nickv2() {
        String myNick;
        try { // first step
            myNick = nick();
        } catch (NoNickCheckedException e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        return myNick;
    }

    public String nickWithRuntimeException() throws NoNickRuntimeExc {
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0) {
            return "leonek";
        } else {
            throw new NoNickRuntimeExc("I have no nick... yep! - NoNickRuntimeException");
        }
    }
}
