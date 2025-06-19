package traltb.example;

import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        String text = "Hello"; // hoặc lấy từ input thực tế thay vì gán null

        if (!text.isEmpty()) {
            logger.info("Text is not empty");
        }else {
            logger.info("Text is empty");
        }
    }
}
