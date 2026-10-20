package org.example.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Day 01 String
 */
public class Day_01 {
    public static void main(String[] args) {
       // System.out.println(reversePrefix("abcdavh",'d'));
        int []nums ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        return new int[]{ -1, -1 };
    }
    public static String reversePrefix(String word, char ch){
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        char[] arr = word.toCharArray();

        int i = 0;
        int j = index;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
    }

