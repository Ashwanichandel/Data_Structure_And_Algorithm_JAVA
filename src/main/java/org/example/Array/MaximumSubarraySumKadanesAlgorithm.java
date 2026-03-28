package org.example.Array;

public class MaximumSubarraySumKadanesAlgorithm {
    public static void main(String[] args) {
    int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maximunSubArraySum(arr));
    }

    public static int maximunSubArraySum(int[] arr) {
        int curr = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}
