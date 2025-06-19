package traltb.example;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    private static final Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());

    public static int getNumber() {
        return 42; // Đoạn code unreachable đã bị xoá
    }

    public static void main(String[] args) {
        logger.info(String.valueOf(getNumber()));
    }
}