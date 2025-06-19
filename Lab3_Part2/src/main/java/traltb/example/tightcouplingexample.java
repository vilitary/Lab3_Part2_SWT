
import java.util.logging.Logger;

// Interface để tách hành vi in ấn
interface Printer {
    void print(String message);
}

// Triển khai cụ thể
class ConsolePrinter implements Printer {
    private static final Logger logger = Logger.getLogger(ConsolePrinter.class.getName());

    @Override
    public void print(String message) {
        logger.info(message);
    }
}

// Lớp sử dụng phụ thuộc thông qua interface (loose coupling)
class Report {
    private final Printer printer;

    public Report(Printer printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}
