package Transportation;

public class Subway {
    String lineNum;
    int passengerCount;
    int money;

    public Subway (String lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNum + "의 승객은 "
                + passengerCount + "명이고, 수입은 " + money + "원입니다.");
    }
}
