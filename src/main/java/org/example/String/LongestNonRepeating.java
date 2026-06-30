package org.example.String;

import java.util.HashMap;
import java.util.HashSet;

public class LongestNonRepeating {
    public static void main(String[] args) {
        longestSubstring("abcabcbb");
        longestSubstring("pwwkew");
        longestSubstring("bbbbb");
    }
    static int longestNonRepeating(){
        HashSet<Character> set = new HashSet<>();
        String s = "abcabcab";
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(left));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void longestSubstring(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        System.out.println("Longest Substring = "
                + str.substring(start, start + maxLength));
        System.out.println("Length = " + maxLength);
    }
}
