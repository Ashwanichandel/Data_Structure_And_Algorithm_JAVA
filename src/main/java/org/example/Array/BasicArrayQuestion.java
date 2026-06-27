package org.example.Array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicArrayQuestion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
      missingArray();
    }

    static void findMaxMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(max + " : " + min);
    }

    static void missingArray( ) {
        int arr1[] = {1,2,3,5,6};
        int arr2[] = {1,2,3,4,5,6};

        Set<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toSet());

        Arrays.stream(arr2).
                filter(num -> !collect.contains(num))
                .forEach(System.out::println);
    }


}