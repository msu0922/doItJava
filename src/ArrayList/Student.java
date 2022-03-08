package ArrayList;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScore();
            System.out.println("학생 " + studentName + "의 " + subject.getName() + " 성적은 " + subject.getScore() + "점 입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + total + "점 입니다.");
    }
}
