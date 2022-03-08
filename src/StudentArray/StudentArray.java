package StudentArray;

public class StudentArray {

    private int studentID;
    private String name;

    public StudentArray(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void setStudentID(int stuID) {
        this.studentID = stuID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showStudentInfo() {
        System.out.println("학생 이름:" + getName() + ", 학번: " + getStudentID());
    }
}
