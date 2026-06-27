package org.example.String;

public class String_practice_02 {
    public static void main(String[] args) {
        String str="Ashwani";
        reverseStringM2(str);
        System.out.println(findFirstNonRepeatedCharacter("Software Services"));
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
    public static String findFirstNonRepeatedCharacter(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            int count=0;
            if(str.charAt(i)!=' '){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j) && i!=j){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    result+=str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
}
