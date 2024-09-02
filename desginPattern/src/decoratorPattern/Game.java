package decoratorPattern;

public class Game extends DecoratorAppStore{

    public Game(BaseSmartPhone baseSmartPhone) {
        super(baseSmartPhone);
    }

    public void gameMode(){
        System.out.println("게임 모드로 인한 중지");
    }

    @Override
    public void alarm(){
        gameMode();
        super.alarm();
    }
}
