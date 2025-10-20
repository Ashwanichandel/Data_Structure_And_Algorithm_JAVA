package org.example.String;

public class RemoveOuterPerentheses {
    public static void main(String[] args) {
        String str = "((()))";
        System.out.println(removeOyterPerenthese(str));
    }

    static String removeOyterPerenthese(String str) {
        StringBuilder result = new StringBuilder();
        int bal = 0;
        //char ch[]=str.toCharArray();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (bal > 0) {
                    result.append(ch);
                }
                bal++;
            } else {
                bal--;
                if (bal > 0) {
                    result.append(ch);
                }
            }

        }
        return result.toString();
    }
}




