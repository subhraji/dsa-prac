package stack;

import java.util.Stack;

public class ReverseStack {
    static Stack<Character> st = new Stack<>();


    static void insert_at_bottom(char x)
    {

        if (st.isEmpty()) {
            st.push(x);
            return;
        }else {

            // All items are held in Function
            // Call Stack until we reach end
            // of the stack. When the stack becomes
            // empty, the st.size() becomes 0, the
            // above if part is executed and
            // the item is inserted at the bottom
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);

            // push allthe items held
            // in Function Call Stack
            // once the item is inserted
            // at the bottom
            st.push(a);
        }
    }


    static void reverse()
    {
        if (st.size() > 0) {

            // Hold all items in Function
            // Call Stack until we
            // reach end of the stack
            char x = st.peek();
            st.pop();
            reverse();

            // Insert all the items held
            // in Function Call Stack
            // one by one from the bottom
            // to top. Every item is
            // inserted at the bottom
            insert_at_bottom(x);
        }
    }

    public static void main(String[] args) {
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");
        System.out.println(st);
        // function to reverse
        // the stack
        reverse();

        System.out.println("Reverse Stack");
        //insert_at_bottom('6');
        System.out.println(st);

    }

    public static void printStack(){
        while (!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
