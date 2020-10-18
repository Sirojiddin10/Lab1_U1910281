package com.company;

import java.util.Scanner;

public class SalesCommissionCalc {
    Scanner input = new Scanner(System.in);
    int choice, count;
    double item1 = 239.99, item2 = 139.75, item3 = 35.49, item4 = 350.89, earning;

    public static void main(String[] args) {
        SalesCommissionCalc calc = new SalesCommissionCalc();

        calc.input();
    }

    public void input() {
        System.out.println("Please enter one of the items");
        System.out.println("1: 239.99$");
        System.out.println("2: 139.75$");
        System.out.println("3: 35.49$");
        System.out.println("4: 350.89$");
        choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Wrong item is chosen, Please input item again");
            choice = input.nextInt();
        }
        System.out.println("Please enter how many items sold");
        count = input.nextInt();
        while (count <= 0) {
            System.out.println("Number of item cannot be either 0 or negative, Please input number of item again");
            count = input.nextInt();
        }
        calculator();
    }

    public void calculator() {
        switch (choice) {
            case 1:
                earning = 200 + ((count * item1 * 9) / 100);
                break;
            case 2:
                earning = 200 + ((count * item2 * 9) / 100);
                break;
            case 3:
                earning = 200 + ((count * item3 * 9) / 100);
                break;
            case 4:
                earning = 200 + ((count * item4 * 9) / 100);
                break;
        }
        System.out.println("Your earning is: " + earning);
    }
}
