package Abstract;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("turnOn()");
    }

    public void turnOff() {
        System.out.println("turnOff()");
    }

}
