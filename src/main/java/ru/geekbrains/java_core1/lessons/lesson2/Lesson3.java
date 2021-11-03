package ru.geekbrains.java_core1.lessons.lesson2;

public class Lesson3 {

    public static void main(String[] args) {

       changeNumbersInArray();
        fillInTheArray();
        multiplyingArrayNumbers();
        check();
        MyArrayUtil.printMyArray(createArray(5, 6 ));
        checkArray();
        System.out.println(checkArrayBalance());
        shiftArray();


    }

    public static void shiftArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MyArrayUtil.printMyArray(arr);
        System.out.println();
        MyArrayUtil.swapsTheElementsOfAnArray(arr, 3);
        MyArrayUtil.printMyArray(arr);
    }

    public static boolean checkArrayBalance() {
        int[] arr = {1,2,2,3,7,8};
        int sum = MyArrayUtil.sumArray(arr);
        int sumbalance = 0;
        if (sum % 2 == 0){
            for (int i = 0; i < arr.length; i++) {
                sumbalance += arr[i];
                if (sum / 2 == sumbalance){
                    return true;
                }
            }
        }
        return false;
    }

    public static void checkArray() {
        int[] arr = {10,2,32,4,5,6,7,8,18,45};
        MyArrayUtil.findMin(arr);
        MyArrayUtil.findMax(arr);
    }



    public static void changeNumbersInArray() {
        int j;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            j = arr[i];
            if (j > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        MyArrayUtil.printMyArray(arr);
    }

    public static void fillInTheArray() {
        int[] arr = new int[100];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j++;
        }
        MyArrayUtil.printMyArray(arr);
    }

    public static void multiplyingArrayNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int j;
        for (int i = 0; i < arr.length; i++) {
            j = arr[i];
            if (j < 6) {
                arr[i] *= 2;
            }
        }
        MyArrayUtil.printMyArray(arr);
    }

    public static void check() {
        int counter = 1;
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = counter;
                }
            }
        }
        MyArrayUtil.printMyArray2(arr);
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}