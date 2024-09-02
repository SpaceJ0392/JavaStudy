package decoratorPattern;

// 기본 구현된 기존 기능들 (ConcreteComponent)
public class BaseSmartPhone implements SmartPhone {
    @Override
    public void alarm() {
        System.out.println("알람 APP");
    }

    @Override
    public void calendar() {
        System.out.println("캘린더 APP");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 APP");
    }

    @Override
    public void call() {
        System.out.println("전화 APP");
    }
}
