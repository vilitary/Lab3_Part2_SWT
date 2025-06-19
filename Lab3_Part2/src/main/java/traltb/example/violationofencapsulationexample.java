package traltb.example;
import java.util.logging.Logger;

class User1 {
    private static final Logger logger = Logger.getLogger(User1.class.getName());

    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        logger.info("Name: " + name + ", Age: " + age);
    }
}
