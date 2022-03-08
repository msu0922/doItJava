package Student;

public class Student {

    int stuID;
    private String stuName;
    char grade;
    String adress;

    public Student() {}

    public Student(int ID, char grade) {
        this.stuID = ID;
        this.grade = grade;
    }

    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

}
