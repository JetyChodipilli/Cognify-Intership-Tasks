package com.ccp;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Palindrome Checker");
        System.out.println("Enter a word or phrase:");
        String input = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(input);
        
        if (isPalindrome) {
            System.out.printf("\"%s\" is a palindrome.%n", input);
        } else {
            System.out.printf("\"%s\" is not a palindrome.%n", input);
        }
        
        scanner.close();
    }
    
    public static boolean checkPalindrome(String str) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Compare characters from start and end
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}