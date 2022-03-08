package Transportation;

public class Bus {
    int busNum;
    int passengerCount;
    int money;

    public Bus (int busNum) {
        this.busNum = busNum;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println("버스" + busNum + "번의 승객은 "
                + passengerCount + "명이고, 수입은 " + money + "원입니다.");
    }
}
