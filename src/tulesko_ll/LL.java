package tulesko_ll;

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
}
