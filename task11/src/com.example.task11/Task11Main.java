package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int start = arr[0];
        arr[0] = min;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = start;
                break;
            }
        }
    }

}