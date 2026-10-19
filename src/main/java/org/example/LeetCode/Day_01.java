package org.example.LeetCode;
/*
Day 01 String
 */
public class Day_01 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdavh",'d'));
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

