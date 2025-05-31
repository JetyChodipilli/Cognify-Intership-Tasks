package com.ccp;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of grades:");
        int numGrades = scanner.nextInt();
        
        // Input validation for number of grades
        while (numGrades <= 0) {
            System.out.println("Please enter a positive number of grades:");
            numGrades = scanner.nextInt();
        }
        
        double[] grades = new double[numGrades];
        double sum = 0.0;
        
        // Input grades
        for (int i = 0; i < numGrades; i++) {
            System.out.printf("Enter grade %d: ", i + 1);
            grades[i] = scanner.nextDouble();
            
            // Input validation for grades (assuming grades are between 0 and 100)
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.printf("Invalid grade. Enter grade %d (0-100): ", i + 1);
                grades[i] = scanner.nextDouble();
            }
            sum += grades[i];
        }
        
        // Calculate and display average
        double average = sum / numGrades;
        System.out.printf("The average grade is: %.2f%n", average);
        
        scanner.close();
    }
}