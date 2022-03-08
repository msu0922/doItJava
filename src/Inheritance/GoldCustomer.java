package Inheritance;

public class GoldCustomer extends Customer{
    private double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price *= (1 - saleRatio);
        return (int) price;
    }

}
