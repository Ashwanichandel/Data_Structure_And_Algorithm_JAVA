package org.example.String;

public class String_practice_02 {
    public static void main(String[] args) {
        String str="Ashwani";
        reverseStringM2(str);
    }
    public static void reverseString(String str){
        str=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
    public static void reverseStringM2(String str){
        str=str.toLowerCase();
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
    }
}
