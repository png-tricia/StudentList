/**
 * Class: Software Design and Development
 * Date: Monday 6, May 2024
 * Exercise 1: create a Student List
 */
package studentlist;

public class StudentList {

    public static void main(String[] args) {
        // Create an array to store n students
        Student[] studentList = new Student[3];
        Student s1 = new Student();
        s1.setName("Patricia Gariando");
        Student s2 = new Student();
        s2.setName("Peppa Pig");
        Student s3 = new Student();
        s3.setName("Elmo's World");
        Student s4 = new Student();
        s4.setName("Bugs Bunny");

        // Store student names inside Student[]
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;

        // Display all Student names
        for (Student s : studentList) {
            System.out.println(s.getName());
        }

    }

}
