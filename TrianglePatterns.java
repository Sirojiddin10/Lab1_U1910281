package com.company;

public class TrianglePatterns {
    public static void main(String[] args) {
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
    }
    public static void Pattern1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void Pattern2(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j>=i;j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern3(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 5; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern4(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
