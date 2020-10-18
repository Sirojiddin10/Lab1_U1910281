package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    static int[] largestNumber = new int[10];
    static int number = 9;
    static int[] sortedArray;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input all the numbers");
        for (int i = 0; i<largestNumber.length;i++){
            largestNumber[i] = input.nextInt();
        }
        largest2Numbers();
        smallestNumber();
    }
    public static void largest2Numbers(){
        sortedArray = Arrays.stream(largestNumber).sorted().toArray();
       System.out.println("The first largest is: " + sortedArray[number] + " The second largest is: " + sortedArray[number-1]);
    }
    public static void smallestNumber(){
        System.out.println(" The smallest is: " + sortedArray[0]);
    }
}
