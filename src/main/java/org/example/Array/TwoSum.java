package org.example.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=8;
        int [] res=twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff= target-arr[i];
            if(map.containsKey(diff)){
                return  new int [] {map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
