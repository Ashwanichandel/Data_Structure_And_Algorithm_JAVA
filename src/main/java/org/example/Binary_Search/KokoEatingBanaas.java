package org.example.Binary_Search;

public class KokoEatingBanaas {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,67};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr) {
        int max = arr[0];   // start with first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    

}
