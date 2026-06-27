package org.example.String;

public class String_Practice_03 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        System.out.println(lastNonRepeating("Software Service"));
    }

    public static String lastNonRepeating(String str) {
        String res = "";
        for (int i = str.length() - 1; i > 0; i--) {
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
}
