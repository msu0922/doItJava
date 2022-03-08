package StudentArray;

public class StudentTest {
    public static void main(String[] args) {

        StudentArray student[] = new StudentArray[3];

        student[0] = new StudentArray(1001, "James");
        student[1] = new StudentArray(1002, "Tomas");
        student[2] = new StudentArray(1003, "Edward");

        for (int i = 0; i < 3; i++) {
            System.out.println(student[i].getStudentID() + ", " + student[i].getName());
        }

    }
}
