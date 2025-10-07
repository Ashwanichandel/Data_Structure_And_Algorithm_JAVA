package org.example.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 24, 25, 26, 27, 28, 29};
        int target = 23;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
