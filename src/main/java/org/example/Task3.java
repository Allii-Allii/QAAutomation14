package org.example;

import java.util.Scanner;

public class Task3 {

    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int number = keyboard.nextInt();
        if (number < 0) {
            System.out.println("Числото е отрицателно.");
        } else if (number > 0) {
            System.out.println("Числото е положително");
        } else {
            System.out.println("Числото е равно на 0");
        }
    }
}
