package org.example.Array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 203, 0, 32, 0, 34};
        int[] res=moveZeroToEnd(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
        return arr;
    }
}
