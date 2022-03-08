package Transportation;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    public String stuName;
    public int grade;
    public int money;

    public Student(String stuName, int money) {
        this.stuName = stuName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void takeTaxi(Taxi taxi) {
        System.out.print("택시 요금이 얼마인가요? >> ");
        int pay = sc.nextInt();
        taxi.take(pay);
        this.money -= pay;
    }

    public void showInfo() {
        System.out.println(stuName + "님의 남은 돈은 " + money + "원입니다.");
    }

}
