package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private Student[] students;


    public Classroom(){

    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];

    }

    public double getAverageExamScore() {
        Double sum = 0.0;
        for(Student student : students){
           sum += student.getAverageExamScore();
        }
        return sum / students.length;
    }


    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length ; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
            }

        }
    }
public Student[] removeStudent(String firstName, String lastName){
    List<Student> studentList = new ArrayList<>(Arrays.asList(students));
    for(Student student : students){
     if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
        studentList.remove(student);
     }

    }
    return studentList.toArray(new Student[0]);
}

public Student[] getStudentByScore(){
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        Collections.sort(studentList); //sorts by average score

        List<Student> newStudentList = new ArrayList<>();
        for (Student student : studentList){
          newStudentList.add(student); // adds sorted students to new ArrayList

        }


   return newStudentList.toArray(new Student[0]);
}

}
