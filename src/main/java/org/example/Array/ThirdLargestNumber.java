package org.example.Array;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 9, 20, 15, 20};
        thirdLargestNumber(arr);
    }

    static void thirdLargestNumber(int arr[]) {
        Integer first = null, second = null, third = null;
        for (int num : arr) {
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second==null||num>second&&num!=first) {
                third = second;
                second = num;
                
            }else if (third==null||num>third&&num!=second&&num!=first) {
                third = num;
            }
        }
        if(third!=null){
            System.out.println(third);
        }else{
            System.out.println("Array doesn't have third unique element");
        }
    }
}
