package Transportation;

public class Taxi {
    String taxiNum;
    int money;

    public Taxi (String taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println("차량번호 " + taxiNum
                + "의 수입은 " + money + "원입니다.");
    }
}


