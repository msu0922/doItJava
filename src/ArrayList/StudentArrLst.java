package ArrayList;

import StudentArray.StudentArray;

import java.util.ArrayList;

public class StudentArrLst {
    public static void main(String[] args) {

        ArrayList<StudentArray> stuArrLst = new ArrayList<StudentArray>();

        stuArrLst.add(new StudentArray(1001, "James"));
        stuArrLst.add(new StudentArray(1002, "Tomas"));
        stuArrLst.add(new StudentArray(1003, "Edward"));

        for (int i = 0; i < stuArrLst.size(); i++) {
            StudentArray arr = stuArrLst.get(i);
            arr.showStudentInfo();
        }

    }
}
