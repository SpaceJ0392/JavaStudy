package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new Game(new BaseSmartPhone());
        smartPhone.alarm();
    }
}
