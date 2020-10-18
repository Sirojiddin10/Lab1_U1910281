package com.company;

public class ApproximatingPi {
    public static void main(String[] args) {
        double s = 1;
        double pi;
        double approx = 0;
        for (int i = 1; i <= 200; i += 2) {
            approx += s / i;
            s = -s;
        }
        pi = approx*4;
        System.out.println(pi);
    }
}

