package org.example.String;

public class ReverseWordOrPalindrome {
    public static void main(String[] args) {
        System.out.println(reverseWordOrPalindrome("java is fun"));
    }
    static String reverseWordOrPalindrome(String str){
        String word[]=str.split(" ");
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            stringBuilder.append(word[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
