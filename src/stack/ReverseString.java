package stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Love";
        char[] ch = str.toCharArray();
        Stack st = new Stack();

        for (int i = 0; i < ch.length; i++){
            st.push(ch[i]);
        }

        String ans = "";
        int i =0;
        while (i < st.size()){
            ans = ans+(char) st.peek();
            st.pop();
        }

        System.out.println(ans);
    }
}
