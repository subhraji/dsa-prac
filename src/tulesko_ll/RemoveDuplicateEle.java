package tulesko_ll;

public class RemoveDuplicateEle {

    public void solve(){
        Node f1 = new Node();
        f1.data = 1;
        Node f2 = new Node();
        f2.data = 2;
        Node f3 = new Node();
        f3.data = 2;
        Node f4 = new Node();
        f4.data = 3;

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = null;

        removeDulicate(f1);
    }

    public void delete(Node node){
        if(node == null){
            return;
        }else {
            node.next = null;
        }
    }

    public void removeDulicate(Node head){
        Node curr = head;
        if(head == null){
            return;
        }

        while (curr != null){
            if((curr.next != null) && curr.data == curr.next.data){
                 Node next_next = curr.next.next;
                 Node nodeToDelete = curr.next;
                 delete(nodeToDelete);
                 curr.next = next_next;
            }else {
                curr = curr.next;
            }
        }

        printLinkedList(head);
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
}
