package org.example.String;

public class String_practice_04 {
    public static void main(String[] args) {
        System.out.println(findDuplicate("banaans"));
      //  reverseString("java");
        printOccurance("bananas ");
    }
    public static void printOccurance(String str){
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i]==ch[j] && ch[i]!='*'){
                    c++;
                    ch[j]='*';
                }
            }
            if(ch[i]!='*'){
                System.out.println(ch[i]+ " : "+c);
            }
        }
    }

    public static String findDuplicate(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            int count=0;
            if(str.charAt(i)!=' '){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j) && i!=j){
                        count++;
                    }
                }
                if(count==0){
                    res+=str.charAt(i);
                }
            }
        }
        return res;
    }
    public static String firstNonRepeating(String str) {
        String res = "";
        for (int i =str.length()-1;i>=0; i--) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    res += str.charAt(i);
                    break;
                }
            }
        }
        return res;
    }

    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        for (int i = str.length() - 1; i >= 0; i--) {
            // System.out.print(str.charAt(i));
        }
    }

}
