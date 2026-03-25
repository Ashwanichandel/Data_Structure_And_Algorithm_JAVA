package org.example.Array;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class CommanQuestionArray {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int target=7;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int []{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,0,45,0,3,4,5,6};
        System.out.println(Arrays.toString(moveZeroToEnd(arr)));
    }

    public static int[] moveZeroToEnd(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static int[] reverse(int arr[]) {
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static int findSecondHigest(int arr[]){
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first= num;
            }else if(num>second && num!=first){
                second=num;
            }
        }
        return second;
    }
}
