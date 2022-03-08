package Inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price *= (1 - saleRatio);
        return (int) price;
    }

    public void showCustomerInfo() {
        super.showCustomerInfo();
        System.out.println("담당 상담원 아이디는 " + agentID + "입니다.");
    }
}
