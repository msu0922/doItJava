package Template;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 시동을 끕니다.");
    }

    @Override
    public void wiper() {
        System.out.println("비가 오는 정도에 따라 조절해서 작동합니다.");
    }
}
