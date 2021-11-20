package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {


    @Test
    public void getAverageExamScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

    }


    @Test
    public void addStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void removeStudent(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("Leon", "Hunter", s1Scores);
        Student s2 = new Student("Dolio", "Younger", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);
        Student[] expected = new Student[]{s2};


        //When
        Student[] actual = classroom.removeStudent("Leon","Hunter");

        //Then
        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void getStudentByGrade(){
        //Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 125.0 };

        Student s1 = new Student("Leon", "Hunter", s1Scores);
        Student s2 = new Student("Dolio", "Younger", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);
        Student[] expected = new Student[]{s2 ,s1};


        //When
        List<Student> actual = new ArrayList<>(Arrays.asList(classroom.getStudentByScore()));

        //Then
        Assert.assertArrayEquals(expected, actual.toArray(new Student[0]));

    }

}
