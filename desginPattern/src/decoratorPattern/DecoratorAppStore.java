package decoratorPattern;

public abstract class DecoratorAppStore implements SmartPhone {
    private final BaseSmartPhone baseSmartPhone;
    public DecoratorAppStore(BaseSmartPhone baseSmartPhone) {this.baseSmartPhone = baseSmartPhone;}

    @Override
    public void alarm() {
        baseSmartPhone.alarm();
    }

    @Override
    public void calendar() {
        baseSmartPhone.calendar();
    }

    @Override
    public void internet() {
        baseSmartPhone.internet();
    }

    @Override
    public void call() {
        baseSmartPhone.call();
    }
}
