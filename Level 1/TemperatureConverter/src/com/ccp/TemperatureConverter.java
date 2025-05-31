package com.ccp;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
        
        System.out.println("Enter the unit (C for Celsius, F for Fahrenheit):");
        String unit = scanner.next().toUpperCase();
        
        double convertedTemp;
        String convertedUnit;
        
        if (unit.equals("C")) {
            convertedTemp = celsiusToFahrenheit(temperature);
            convertedUnit = "Fahrenheit";
        } else if (unit.equals("F")) {
            convertedTemp = fahrenheitToCelsius(temperature);
            convertedUnit = "Celsius";
        } else {
            System.out.println("Invalid unit. Please use C or F.");
            scanner.close();
            return;
        }
        
        System.out.printf("%.2f %s is equal to %.2f %s%n", 
            temperature, unit.equals("C") ? "Celsius" : "Fahrenheit", 
            convertedTemp, convertedUnit);
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}