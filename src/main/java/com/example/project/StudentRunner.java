package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        Student student = new Student("Benjamin", "Smull", 2026);
        student.addTestScore(50);
        student.addTestScore(40);
        student.addTestScore(35);
        student.addTestScore(15);
        student.addTestScore(9);
        student.printStudentInfo();
    }
}