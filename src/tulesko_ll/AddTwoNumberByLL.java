package tulesko_ll;

public class AddTwoNumberByLL {
    static LL list = new LL();
    /*public static void main(String[] args) {

        addTwoList();
        list.reverseLl();
        list.show();
    }
*/
    public Node reverseLl(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void addTwoList(){
        Node f1 = new Node();
        f1.data = 1;
        Node f2 = new Node();
        f2.data = 2;
        Node f3 = new Node();
        f3.data = 0;

        f1.next = f2;
        f2.next = f3;
        f3.next = null;

        //second linked list
        Node s1 = new Node();
        s1.data = 2;
        Node s2 = new Node();
        s2.data = 4;

        s1.next = s2;
        s2.next = null;

        //reverse two linked list
        Node first = reverseLl(f1);
        Node second = reverseLl(s1);

        add(first, second);
        list.reverseLl();
        list.show();
    }

    /*static void insertAtTail(Node head, Node tail, int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        if(head == null){
            head = temp;
            tail = temp;
            return;
        }else {
            tail.next = temp;
            tail = temp;
        }
    }*/

    public void add(Node first, Node second){
        int carry = 0;

        while (first != null && second != null){
            int sum = carry + first.data + second.data;
            int digit = sum%10;
            list.insertInt(digit);
            carry = sum/10;
            first = first.next;
            second = second.next;
        }

        while (first != null){
            int sum = carry + first.data;
            int digit = sum%10;
            list.insertInt(digit);
            carry = sum/10;
            first = first.next;
        }

        while (second != null){
            int sum = carry + second.data;
            int digit = sum%10;
            list.insertInt(digit);
            carry = sum/10;
            second = second.next;
        }

        while (carry != 0){
            int sum = carry;
            int digit = sum%10;
            list.insertInt(digit);
            carry = sum/10;
        }
    }
}
