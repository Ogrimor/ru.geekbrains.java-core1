package ru.geekbrains.java_core1.lessons.lesson1;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(chekingTwoNumbers());
        chekingNumber();
        System.out.println(chekingNumber1());
        printString();
        System.out.println(chekingYear());
        sc.close();

    }

    public static boolean chekingTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = sc.nextInt();
        System.out.println("Введите число b: ");
        int b = sc.nextInt();
        int c = a + b;
        boolean c1;
        if (c > 10 && c <= 20) {
            c1 = true;
        } else {
            c1 = false;
        }
        return c1;
    }

    public static void chekingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean chekingNumber1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = sc.nextInt();
        boolean b;
        if (a >= 0) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static void printString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемый текст: ");
        String text = sc.nextLine();
        System.out.println("Сколько раз нужно напечатать данный текст?");
        int counter = sc.nextInt();
        for (int i = 0; i < counter; i++) {
            System.out.println(text);

        }
    }

    public static boolean chekingYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = sc.nextInt();
        boolean b;
        if ( a %400 == 0) {
            b = true;
        } else if ( a %100 != 0 && a %4 == 0) {
            b = true;
        } else {
            b = false;
    }
        return b;
    }

}
