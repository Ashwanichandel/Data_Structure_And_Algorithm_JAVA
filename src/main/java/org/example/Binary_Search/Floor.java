package org.example.Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {12, 23, 24, 25, 27, 28, 29};
        int target = 27;
        System.out.println(cieling(arr, target));
    }

    static int cieling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[arr.length - 1]) {
                return -1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
