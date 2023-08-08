package stack;

import java.util.Stack;

public class RemoveMiddle {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(9);
        st.push(12);

        int count = 0;
        int mid = st.size()/2;
        int arr[] = new int[mid];

        while (count != mid){
            arr[count] = (int) st.peek();
            st.pop();
            count++;
        }

        st.pop();

        for (int i = 0; i<mid; i++){
            st.push(arr[i]);
        }

        System.out.println(st);
    }
}
