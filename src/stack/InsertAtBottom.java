package stack;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        insert(s, 7);
    }

    public static void insert(Stack st, int num){
        Stack temp = new Stack();

        while (!st.empty()){
            temp.push(st.peek());
            st.pop();
        }
        st.push(num);

        while (!temp.empty()){
            st.push(temp.peek());
            temp.pop();
        }

        //print stack
        while (!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
