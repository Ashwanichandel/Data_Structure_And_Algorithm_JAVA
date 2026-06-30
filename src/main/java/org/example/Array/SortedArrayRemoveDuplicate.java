package org.example.Array;

import java.util.Arrays;
import java.util.HashSet;

public class SortedArrayRemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(missingArray());
        missingTwoArrayNUm();
    }
    public static int  missingArray(){
     int arr[]={1,2,3,5};
     int sum=0;
     for(int num:arr){
         sum+=num;
     }
     int num=5;
     int actualSum=num*(num+1)/2;
     return actualSum-sum;
    }
    public static void missingTwoArrayNUm(){
        int []arr1={1,2,3,4,5};
        int arr2[]={2,3,1,5};
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr2){
            set.add(num);
        }

        for (int num:arr1){
            if(!set.contains(num)){
                System.out.println(num);
            }
        }

    }
}
