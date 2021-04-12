package com.company;

import java.util.Scanner;

public class Inputs {
    public static int inputNumber() {
        Scanner inputNames = new Scanner(System.in);

        int number = inputNames.nextInt();

        while (number < 0) {
            number = inputNames.nextInt();
        }

        return number;
    }

    public static String inputString() {
        Scanner inputNames = new Scanner(System.in);

        return inputNames.nextLine();
    }
}
