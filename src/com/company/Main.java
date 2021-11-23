package com.company;

public class Main {

    public static void main(String[] args) {
        double[] number = {15.2, 11.45, -6.7, 77.7, -9.1, 12.6, 74.5, 33.3, -6.6, -5.77, 10.82, 12.6, 76.1, 85.5, 45.7, 1.5};
        double sum = 0;
        int num = 0;
        boolean negative = false;
        for (double d : number) {
            if (d < 0) {
                negative = true;
            } else {
                if (negative) {
                    num++;
                    sum += d;
                }
            }
        }
        System.out.println("Average" + sum / num);

    }
}


