package linked_list;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insertAt(int val, int index){
        if(head == null){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 0; i<index-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteAt(int index){
        if(head == null){
            return;
        }

        if(index == 0){
            Node temp = head;
            head = head.next;

            temp.next = null;

            return;
        }

        Node temp = head;

        for (int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        Node next = temp.next.next;
        Node deleteAt = temp.next;

        temp.next = next;
        deleteAt.next = null;
    }

    public void reverseLl(){
        Node currentNode = head;
        Node next = null;
        Node prev = null;
        while (currentNode != null){
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        head = prev;
    }

    public void findMid(){

        if(head == null || head.next == null){
            return;
        }

        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
        return;
    }

    //odd after even linkedlist
    public Node oddAfterEvenLinkedList(){
        if(head == null){
            return null;
        }

        Node oddHead = null;
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;
        Node temp = head;

        while (temp != null) {
            if (temp.value % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }

            temp = temp.next;
        }

        if(oddHead == null){
            evenTail.next = null;
            return oddHead;
        }

        if (evenHead == null){
            evenTail.next = null;
            return evenHead;
        }

        oddTail.next = evenHead;
        evenTail.next = null;


        return oddHead;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String args[]){

    }
}
