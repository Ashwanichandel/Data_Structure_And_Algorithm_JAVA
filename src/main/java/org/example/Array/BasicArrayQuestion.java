package org.example.Array;

import java.util.*;
import java.util.stream.Collectors;

public class BasicArrayQuestion {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static void findMaxm(int num[]) {
        int min = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }
        System.out.println("Max::" + max + ", Min::" + min);
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

    static int[] findMissing() {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 5, 6};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return new int[]{0};
                } else {
                    return arr2;
                }
            }
        }
        return arr1;
    }

    static void missingArray() {
        int arr1[] = {1, 2, 3, 5, 6};
        int arr2[] = {1, 2, 3, 4, 5, 6};

        Set<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Arrays.stream(arr2).
                filter(num -> !collect.contains(num))
                .forEach(System.out::println);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        // output:: [5,6]
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
            list.add(i);
        }
        return list;
    }

}