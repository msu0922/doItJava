package Exercise;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() { return day; }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() { return month; }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() { return year; }
    public void setYear(int year) {
        this.year = year;
    }

    MyDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public boolean isValid() {
        if (month == 2) { // 2월
            if (year % 4 == 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0) { // 윤년
                if (day <= 29) { return true; }
            } else { // 평년
                if (day <= 28) { return true; }
            }
        } else if (month == 1 || month == 3 || month == 5
                || month == 7 ||month == 8 || month == 10
                || month == 12) { // 31일
            if (day <= 31) { return true; }
        } else  if (month == 4 || month == 6
                || month == 9 || month == 11){ // 30일
            if (day <= 30) { return true; }
        }
        return false;
    }


}
