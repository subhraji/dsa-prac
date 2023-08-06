package stack;

public class Stack {
    //properties
    public int arr[];
    public int top, size;

    //behaviour
    public Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element){
        if(size - top > 1){
            top++;
            arr[top] = element;
        }else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop(){
        if(top >= 0){
            top--;
        }else {
            System.out.println("Stack Underflow");
        }
    }

    public int peek(){
        if(top >= 0 && top<size){
            System.out.println(arr[top]);
            return arr[top];
        }else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public Boolean empty(){
        if(top == -1){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(22);
        st.push(34);
        st.push(44);

        st.pop();
        st.pop();
        st.pop();
        st.peek();
        st.empty();
    }
}
