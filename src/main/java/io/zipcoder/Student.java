package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int NumberOfExamsTaken;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }


    @Override
    public String toString(){
    return ("Student Name: " + getFirstName() + " " + getLastName()  +"\n"+
             "> Average Score: " + getAverageExamScore() + "\n"+
            "> Exam Scores: \n" + getTestScores());


    }

    public Double getAverageExamScore() {
       Double sum = 0.0;
       for(Double score : examScores){
        sum += score;

       }
       return sum / examScores.size();
    }

  public String setExamScore(int examNumber, double newScore){
       examScores.set(examNumber -1, newScore);
       return ("Exam " + examNumber + " -> " + examScores.get(examNumber - 1));

    }


    public String addExamScore(double examScore) {
        examScores.add(examScore);

        return "Exam 1 -> " + examScores.get(0);
    }

    public String getTestScores() {
        String testScores = "";
        for (int i = 0; i < examScores.size(); i++) {
            testScores += ("Exam " + (i + 1) + " -> " + examScores.get(i) + "\n");
        }

        return testScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public ArrayList<Double> getExamScores() {
        return examScores;
    }


}
