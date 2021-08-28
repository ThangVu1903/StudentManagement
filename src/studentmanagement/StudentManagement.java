package studentmanagement;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> studentList =new ArrayList<>();

    public ArrayList<Student> getList() {
        return studentList;
    }


    public void addStudent(Student student){
        for (Student std : studentList){
            if (std.getID()==student.getID()) {
                System.out.println("This student has existed!, please re-enter.");
                return;
            }
        }
        studentList.add(student);
    }


    public void removeStudent(Student student){studentList.remove(student);}
    public Student searchStudent(long ID){
        for (Student student: studentList){
            if (student.getID()==ID){
                return student;
            }
        }
        return null;
    }

}
