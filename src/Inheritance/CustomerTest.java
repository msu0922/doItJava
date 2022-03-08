package Inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
/*
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        customerLee.showCustomerInfo();

        System.out.println();

        VIPCustomer vipCustomerKim = new VIPCustomer();
        vipCustomerKim.setCustomerName("김유신");
        vipCustomerKim.setCustomerID(10020);
        vipCustomerKim.bonusPoint = 10000;
        vipCustomerKim.showVIPInfo();
*/
        ArrayList<Customer> customerList= new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "Lee");
        Customer customerShin = new Customer(10020, "Shin");
        Customer customerHong = new GoldCustomer(10030, "Hong");
        Customer customerYoul = new GoldCustomer(10040, "Youl");
        Customer customerKim = new VIPCustomer(10040, "Kim", 10234);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYoul);
        customerList.add(customerKim);

        System.out.println("===== 고객 정보 출력 =====");
        for (Customer customer : customerList) {
            customer.showCustomerInfo();
        }

        System.out.println("===== 할인율/포인트 =====");
        int price = 10000;

        for (Customer customer : customerList) {
            int cost = customer.calPrice(price);
            System.out.println(customer.getCustomerName() + "님의 지불 금액은 " + cost + "원 입니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 포인트는 " + customer.bonusPoint + "점 입니다.");
        }

    }
}
