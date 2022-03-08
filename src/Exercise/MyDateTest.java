package Exercise;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        if (date1.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };

        MyDate date2 = new MyDate(2, 10, 2006);
        if (date2.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };

        MyDate date3 = new MyDate(32, 1, 1999);
        if (date3.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };

        MyDate date4 = new MyDate(30, 13, 1995);
        if (date4.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };

        MyDate date5 = new MyDate(29, 2, 2001);
        if (date5.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };

        MyDate date6 = new MyDate(29, 2, 2016);
        if (date6.isValid() == true) {
            System.out.println("유효한 날짜입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        };
    }
}
