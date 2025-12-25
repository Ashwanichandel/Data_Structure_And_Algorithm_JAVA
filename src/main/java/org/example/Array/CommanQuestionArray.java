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
