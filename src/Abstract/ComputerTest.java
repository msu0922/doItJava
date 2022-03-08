package Abstract;

public class ComputerTest {
    public static void main(String[] args) {

        Computer c1 = new Desktop();
        c1.display(); // >>> Desktop.display()
//        Computer c2 = new Laptop(); // Laptop이 abstract class라서 불가능
//        d1.display();

        Desktop desktop = new Desktop();
        desktop.turnOn();


    }
}
