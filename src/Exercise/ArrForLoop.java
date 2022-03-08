package Exercise;

public class ArrForLoop {
    public static void main(String[] args) {

        String[] strArr = {"Java", "Android", "C", "JavaScript", "Python"};

        for (String lang : strArr) {
            System.out.println(lang);
        }

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i+1;
        }

        for (int number : numArr) {
            System.out.println(number);
        }
    }
}
