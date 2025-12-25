package org.example.String;

public class PracticeDay01 {
    public static void main(String[] args) {
        isPalindrome("Ashwani");
    }

    static void reverseString(String str) {
        for (int i = str.length() - 1; i >=0; i--) {
            System.out.println(str.charAt(i));
        }
    }
    static String secondMethodToReverse(String str){
        StringBuilder sb= new StringBuilder(str);
        return sb.reverse().toString();

    }
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i++)!=str.charAt(j--))
                return false;
        }
        return  true;
    }

    
}
