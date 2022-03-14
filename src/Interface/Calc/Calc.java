package Interface.Calc;

public interface Calc {

    double PI = 3.14; // = public static final
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);

}
