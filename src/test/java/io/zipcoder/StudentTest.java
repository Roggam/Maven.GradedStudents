package io.zipcoder;

import org.junit.Test;

public class StudentTest {

    public static void main(String[] args) {

    }

    @Test
    public void getTestScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getTestScores();

// Then
        System.out.println(output);

    }

@Test
    public void addExamScoreTest(){
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = {};
    Student student = new Student(firstName, lastName, examScores);

    // When
    student.addExamScore(100.0);
    String output = student.getTestScores();

     // Then
     System.out.println(output);
}

@Test
    public void setExamScoreTest(){
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = { 100.0 };
    Student student = new Student(firstName, lastName, examScores);

// When
    student.setExamScore(1, 150.0);
    String output = student.getTestScores();

// Then
    System.out.println(output);


}

}