package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        for (int i = arr.length-1; i > 0 ; --i) {
            if (arr[i] == min)
            {
                return i;
            }
        }

        return 0;
    }

}