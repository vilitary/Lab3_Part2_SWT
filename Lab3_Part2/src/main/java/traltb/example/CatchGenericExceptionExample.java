package traltb.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = "abc";
            logger.info("Length: " + s.length());
        } catch (NullPointerException e) {
            logger.log(Level.SEVERE, "NullPointerException occurred", e);
        }
    }
}
