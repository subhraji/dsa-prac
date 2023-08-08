package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "({[]})([)]";
        isBalanced(str);
    }


    public static Boolean isBalanced(String str){
        Stack s = new Stack();
        char[] expression = str.toCharArray();

        for(int i = 0; i<expression.length; i++){

            char ch = expression[i];

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                if(!s.empty()){
                    char top = (char) s.peek();

                    if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')){
                        s.pop();
                    }else {
                        System.out.println("not balanced");
                        return false;
                    }
                }else {
                    System.out.println("not balanced");
                    System.out.println(false);
                }
            }
        }

        if(s.empty()){
            System.out.println("balanced");
            return true;
        }else {
            System.out.println("not balances");
            return false;
        }
    }
}
