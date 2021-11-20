package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

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


}
