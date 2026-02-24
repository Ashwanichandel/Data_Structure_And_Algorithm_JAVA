package org.example.String;

public class String_practice_02 {
    public static void main(String[] args) {
        String str="Ashwani";
        reverseString(str);
    }
    public static void reverseString(String str){
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
