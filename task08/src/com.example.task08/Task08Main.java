package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        long mult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) { mult = 1; }
            mult *= arr[i];
        }
        return mult;
    }

}