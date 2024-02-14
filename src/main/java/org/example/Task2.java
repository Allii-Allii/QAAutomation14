package org.example;

import java.util.Scanner;

import static org.example.Main.keyboard;

public class Task2 {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Въведете дължина: ");
        int length = keyboard.nextInt();
        while (length <= 0) {
            System.out.println("Въведете положително число!");
            length = keyboard.nextInt();
        }

        System.out.println("Въведете височина: ");
        int height = keyboard.nextInt();

        while (height <= 0) {
            System.out.println("Въведете положително число!");
            height = keyboard.nextInt();
        }

        int perimeter = (length + height) * 2;

        System.out.println("Периметър е равен на: " + perimeter);
    }
}
