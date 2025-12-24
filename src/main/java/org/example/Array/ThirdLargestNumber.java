package org.example.Array;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 9, 20, 15, 20,21,22};
        System.out.println(secondLargest(arr));
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
    static int largestElement(int[] arr){
        int largest=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]){
                largest=arr[i];
            }
        }
        return largest;
    }
    static int secondLargest(int arr[]){
        Integer first=null,second=null;
        for(int num:arr){

            if(first==null||num>first){
                second=first;
                first=num;
            } else if (second==null||num>second&&first!=num) {
                second=num;
            }
        }
        return second;
    }

}
