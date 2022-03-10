package Template;

public class ManualCar extends Car{

    /*@Override
    public void turnOff() {
        System.out.println("기름이 없어서 시동이 꺼졌습니다.");
    }*/

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("직접 와이퍼를 작동시킵니다.");
    }
}
