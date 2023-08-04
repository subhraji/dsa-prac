package tulesko_ll;

public class ReverseEveryKNode {
    public void solve(){
        Node f1 = new Node();
        f1.data = 1;
        Node f2 = new Node();
        f2.data = 2;
        Node f3 = new Node();
        f3.data = 3;
        Node f4 = new Node();
        f4.data = 4;
        Node f5 = new Node();
        f5.data = 5;
        Node f6 = new Node();
        f6.data = 6;
        Node f7 = new Node();
        f7.data = 7;
        /*Node f8 = new Node();
        f8.data = 8;
        Node f9 = new Node();
        f9.data = 9;*/


        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;
        f5.next = f6;
        f6.next = f7;
        f7.next = null;
        /*f8.next = f9;
        f9.next = null;*/
        printLinkedList(f1);

        printLinkedList(reverseKNodeAgain(f1));
    }

    public void printLinkedList(Node head){

        if(head == null){
            return;
        }
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("\n");
    }

    public Node reverseLl(Node head1){
        Node curr = head1;
        Node pointHead = head1;
        int count = 0;
        int countHead = 0;
        Node temp = head1;
        Node tail = null;

        while (temp != null){
            Node prev = null;
            Node next = null;
            while (count < 3 && curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;

                if(count <= 2){
                    tail = curr;
                }

                curr = next;
                count++;

            }

            count = 0;
            temp = curr;

            if(countHead == 1){
                pointHead = prev;
            }
            countHead++;
        }
        return pointHead;
    }


    public Node reverseKNodeAgain(Node head){
        Node curr = head;
        Node returnHead = null;
        Node temp = head;

        Node tail = null;
        Node newHead = null;
        Node newTail = null;
        Node prevTail = null;

        int tempCount = 0;

        while (temp != null) {
            Node prev = null;
            Node next = null;

            int count = 0;

            while (count < 3 && curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

                if (count == 0 && tempCount == 0) {
                    tail = prev;
                }else {

                }
                count++;
                if(curr != null){
                    newHead = curr;
                }
                if(tempCount == 0){
                    returnHead = prev;
                }
                temp = curr;
            }
            prevTail = tail;
            newTail = tail;
            newTail.next = newHead;

            tempCount++;
            //System.out.print("tail => "+ tail.data+" and head => "+newHead.data);
            //System.out.print("\n");
        }

        return returnHead;
    }
}