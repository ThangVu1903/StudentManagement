package studentmanagement;

import com.sun.javaws.jnl.IconDesc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        ArrayList<Student> studentList = studentManagement.getList();
        showMenu();
        while(true){
            int number= scanner.nextInt();
            switch (number){
                case 1 :
                    System.out.println("Enter student information Need more:");
                    Student std1= inputInfo();
                    studentManagement.addStudent(std1);
                    System.out.println(" success");
                    break;
                case 2:
                    System.out.println("Enter the student ID to delete: ");
                    long idDelete = scanner.nextLong();
                    Student std2 = studentManagement.searchStudent(idDelete);
                    if(std2 != null){
                        studentManagement.removeStudent(std2);
                        System.out.println("Delete successful student");
                    }
                    else {
                        System.out.println("No student found!!");
                    }
                    break;
                case 3 :
                    System.out.println("Enter the student ID to search: ");
                    long idSearch = scanner.nextLong();
                    Student std3 = studentManagement.searchStudent(idSearch);
                    if(std3 == null){
                        System.out.println("Students do not exist, please operate again");
                        break;
                    }
                    break;
                case 4:
                       for (Student std4 :studentList){
                           display(std4);
                       }
                    break;
                case 5:
                    System.out.println("Enter ID to view the average score: ");
                    long idAverage = scanner.nextLong();
                    Student std5 = studentManagement.searchStudent(idAverage);
                    if (std5 != null){
                        std5.getAverageScore();
                        System.out.println("Average point is: ");
                    }
                    else {
                        System.out.println("No student found!!");
                    }
                    break;
                case 6:
                    showMenu();
                    break;
                case 7:
                    System.out.println("good bye...");
                    return;
                default:
                    System.out.println("Please select 1-7 !");

            }
        }
    }

    public static void showMenu(){
        System.out.println("-----WELCOME-----");
        System.out.println("Please select the number to perform functions");
        System.out.println("-----------------------");
        System.out.println("1.Add student");
        System.out.println("2.Delete student");
        System.out.println("3.Search student");
        System.out.println("4.Display all");
        System.out.println("5.show menu");
        System.out.println("6.exit");
    }
    public static Student inputInfo() {
        Student student = new Student();
        System.out.println("enter ID : ");
        long ID = scanner.nextLong();
        student.setID(ID);
        scanner.nextLine();
        System.out.println("enter name : ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("enter major : ");
        String major = scanner.nextLine();
        student.setMajor(major);
        System.out.println("enter theoryScore: ");
        while (true) {
            float theoryScore = scanner.nextFloat();
            scanner.nextLine();
            boolean check = student.setTheoryScore(theoryScore);
            if (check) {
                break;
            }
        }
        System.out.println("enter practiceScore: ");
        while (true) {
            float practiceScore = scanner.nextFloat();
            scanner.nextLine();
            boolean check = student.setPracticeScore(practiceScore);
            if (check) {
                break;
            }
        }
        student.setAverageScore((student.getTheoryScore()+ student.getPracticeScore())/2);
        return student;
    }
    public static void display(Student student){
        System.out.println(student.toString());
    }

}
