package com.company;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        int weight;
        double BMI, height;
        String bmiString = "You are ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your height (in meters): ");
        height = scanner.nextDouble();
        System.out.print("Your weight(in kilograms): ");
        weight = scanner.nextInt();
        BMI = weight / (height * height);
        System.out.println("Your BMI: " + BMI);
        if (BMI < 18.5) {
            bmiString += "underweight";
        } else if (BMI > 18.5 && BMI <= 24.9) {
            bmiString += "normal";
        } else if (BMI >= 25 && BMI <= 29.9) {
            bmiString += "overweight";
        } else if (BMI > 30) {
            bmiString += " obese";
        }
        System.out.println(bmiString);
    }
}
