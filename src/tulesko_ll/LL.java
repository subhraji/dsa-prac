package tulesko_ll;

import java.util.ArrayList;

public class LL {
    Node head;

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public void insertInt(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtPost(int data, int index){
        Node node = new Node();
        node.data = data;

        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtPos(int pos){
        Node temp = head;

        if(pos == 0){
            head = temp.next;
            temp.next = null;
            return;
        }

        for (int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        Node deleteNode = temp.next;
        temp.next = temp.next.next;
        deleteNode.next = null;
    }

    public void reverseLl(){
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    //merge sorted linkedlist of 0s, 1s and 2s
    public void mergeTwo0s1sLinkedList(){
        Node zeroHead = new Node();
        zeroHead.data = -1;
        Node zeroTail = zeroHead;

        Node oneHead = new Node();
        oneHead.data = -1;
        Node oneTail = oneHead;

        Node twoHead = new Node();
        twoHead.data = -1;
        Node twoTail = twoHead;

        Node temp = new Node();
        temp = head;

        while (temp != null){
            if(temp.data == 0){
                zeroTail.next = temp;
                zeroTail = temp;
            }

            if(temp.data == 1){
                oneTail.next = temp;
                oneTail = temp;
            }

            if(temp.data == 2){
                twoTail.next = temp;
                twoTail = temp;
            }
            temp = temp.next;
        }

        if(oneHead.next != null){
            zeroTail.next = oneHead.next;
        }else {
            zeroTail.next = twoHead.next;
        }
        oneTail.next = twoHead.next;
        twoTail.next = null;

        head = zeroHead.next;
    }

    //merge two sorted linked list
    public void mergeTowSortedLinkedList(){
        //first linked list
        Node f1 = new Node();
        f1.data = 1;
        Node f2 = new Node();
        f2.data = 3;
        Node f3 = new Node();
        f3.data = 5;

        f1.next = f2;
        f2.next = f3;
        f3.next = null;

        //second linked list
        Node s1 = new Node();
        s1.data = 2;
        Node s2 = new Node();
        s2.data = 4;
        Node s3 = new Node();
        s3.data = 5;

        s1.next = s2;
        s2.next = s3;
        s3.next = null;

        printLinkedList(f1);
        printLinkedList(s1);

        //call method to merge linked lists
        if(f1.data <= s1.data){
            solveMerge(f1, s1);
            printLinkedList(f1);
        }else {
            solveMerge(s1, f1);
            printLinkedList(s1);
        }
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

    public void solveMerge(Node first, Node second){
        if(first.next == null){
            first.next = second;
            second.next = null;
            return;
        }

        Node curr1 = first;
        Node next1 = first.next;
        Node curr2 = second;
        Node next2 = null;

        while (curr2 != null && next1 != null){
            if(curr2.data >= curr1.data && curr2.data <= next1.data){
                //add node in between the first list
                curr1.next = curr2;
                next2 = curr2.next;
                curr2.next = next1;

                //update pointers
                curr1 = curr2;
                curr2 = next2;
            }else {
                curr1 = next1;
                next1 = next1.next;

                if(next1 == null){
                    curr1.next = curr2;
                    return;
                }
            }
        }
    }

    //check palindrome

    //approach - |
    public void checkPalindromeLinkedList(){
        ArrayList<Integer> arr = new ArrayList<>();

        Node l1 = new Node();
        l1.data = 1;
        Node l2 = new Node();
        l2.data = 3;
        Node l3 = new Node();
        l3.data = 5;

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        Node temp = l1;
        while (temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }

        System.out.print(checkPalindromeArray(arr));
    }

    public Boolean checkPalindromeArray(ArrayList<Integer> arrayList){
        Integer start = 0;
        Integer end = arrayList.size()-1;

        while (start <= end){
            if (arrayList.get(start) != arrayList.get(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //approach ||
    public Boolean checkPalindrome2(){
        Node l1 = new Node();
        l1.data = 1;
        Node l2 = new Node();
        l2.data = 5;
        Node l3 = new Node();
        l3.data = 3;
        Node l4 = new Node();
        l4.data = 2;
        Node l5 = new Node();
        l5.data = 1;

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        Node mid = findMid(l1);
        Node head1 = l1;
        Node head2 = reverseLl(mid.next);

        while (head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public Node reverseLl(Node head1){
        Node curr = head1;
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

    public Node findMid(Node head1){
        Node slow = head1;
        Node fast = head1.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
