package ru.geekbrains.java_core1.lessons.lesson2;

public class MyArrayUtil {

    public static void printMyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void printMyArray2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void swapsTheElementsOfAnArray(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[0] = temp;
            }
        } else {
            for (int i = 0; i > n; i--) {
                int temp = arr[0];

                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[arr.length - 1] = temp;
            }
        }
    }
}
