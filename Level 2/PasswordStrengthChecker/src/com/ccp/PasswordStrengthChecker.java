package com.ccp;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Password Strength Checker");
        System.out.println("Enter a password to check its strength:");
        String password = scanner.nextLine();
        
        String strength = checkPasswordStrength(password);
        System.out.printf("Password: %s%nStrength: %s%n", password, strength);
        
        scanner.close();
    }
    
    public static String checkPasswordStrength(String password) {
        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        // Analyze password for character types
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            else if (Character.isLowerCase(c)) hasLowercase = true;
            else if (Character.isDigit(c)) hasNumber = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        // Calculate strength score
        int score = 0;
        if (length >= 8) score += 2; // Length >= 8
        else if (length >= 6) score += 1; // Length >= 6
        if (hasUppercase) score += 1;
        if (hasLowercase) score += 1;
        if (hasNumber) score += 1;
        if (hasSpecial) score += 1;
        
        // Determine strength based on score
        if (score >= 5) {
            return "Strong (meets all criteria)";
        } else if (score >= 3) {
            return "Moderate (meets some criteria)";
        } else {
            return "Weak (missing several criteria)";
        }
    }
}