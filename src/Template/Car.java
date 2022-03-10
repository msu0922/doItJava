package Template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() { // final 메소드는 하위 클래스에서 재정의 할 수 없음
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
