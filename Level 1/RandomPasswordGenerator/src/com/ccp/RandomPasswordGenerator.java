package com.ccp;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Random Password Generator");
        System.out.println("Enter the desired password length:");
        int length = scanner.nextInt();
        
        // Input validation for password length
        while (length <= 0) {
            System.out.println("Please enter a positive length:");
            length = scanner.nextInt();
        }
        
        System.out.println("Include lowercase letters? (y/n):");
        boolean includeLowercase = scanner.next().toLowerCase().equals("y");
        
        System.out.println("Include uppercase letters? (y/n):");
        boolean includeUppercase = scanner.next().toLowerCase().equals("y");
        
        System.out.println("Include numbers? (y/n):");
        boolean includeNumbers = scanner.next().toLowerCase().equals("y");
        
        System.out.println("Include special characters? (y/n):");
        boolean includeSpecial = scanner.next().toLowerCase().equals("y");
        
        // Validate that at least one character type is selected
        if (!includeLowercase && !includeUppercase && !includeNumbers && !includeSpecial) {
            System.out.println("Error: At least one character type must be selected.");
            scanner.close();
            return;
        }
        
        String password = generatePassword(length, includeLowercase, includeUppercase, 
                                        includeNumbers, includeSpecial);
        System.out.printf("Generated Password: %s%n", password);
        
        scanner.close();
    }
    
    public static String generatePassword(int length, boolean includeLowercase, 
                                         boolean includeUppercase, boolean includeNumbers, 
                                         boolean includeSpecial) {
        StringBuilder validChars = new StringBuilder();
        if (includeLowercase) validChars.append(LOWERCASE);
        if (includeUppercase) validChars.append(UPPERCASE);
        if (includeNumbers) validChars.append(NUMBERS);
        if (includeSpecial) validChars.append(SPECIAL);
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(validChars.length());
            password.append(validChars.charAt(index));
        }
        
        return password.toString();
    }
}