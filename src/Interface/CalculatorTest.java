package Interface;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalculator();

        System.out.println(calc.add(num1, num2));

    }
}
