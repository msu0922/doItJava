package Student;

public class StudentTest {
    public static void main(String[] args) {

        Student stuLee = new Student();
        stuLee.setStuName("홍길동");

        System.out.println(stuLee.getStuName() + ", " + stuLee);

        Student stuKim = new Student(202001142, 'A');
        stuKim.setStuName("김민수");
        System.out.println(stuKim.getStuName() + ", "  + stuKim);
    }
}
