package Transportation;

public class takeTrans {
    public static void main(String[] args) {
        Student James = new Student("James", 5000);
        Student Thomas = new Student("Thomas", 7500);
        Student Edward = new Student("Edward", 15000);

        Bus bus100 = new Bus(100);
        James.takeBus(bus100);
        James.showInfo();
        bus100.showInfo();
        System.out.println();

        Subway subwayGreen = new Subway("Green");
        Thomas.takeSubway(subwayGreen);
        Thomas.showInfo();
        subwayGreen.showInfo();
        System.out.println();

        Taxi taxi13바2703 = new Taxi("13바2703");
        Edward.takeTaxi(taxi13바2703);
        Edward.showInfo();
        taxi13바2703.showInfo();
    }
}
