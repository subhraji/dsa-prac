package tulesko_ll;

public class RemoveDuplicateEle {

    public void solve(){
        Node f1 = new Node();
        f1.data = 1;
        Node f2 = new Node();
        f2.data = 3;
        Node f3 = new Node();
        f3.data = 1;
        Node f4 = new Node();
        f4.data = 1;

        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = null;

        //remove duplicate from sorted ll
        //removeSortedDulicate(f1);

        //remove duplicate from un sorted ll
        removeFromUnSortedLL(f1);
    }

    public void delete(Node node){
        if(node == null){
            return;
        }else {
            node.next = null;
        }
    }

    public void removeSortedDulicate(Node head){
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

    //1 - 3 - 2 - 3 - null

    public void removeFromUnSortedLL(Node head){
        Node curr = head;
        if(head == null){
            return;
        }

        while (curr != null){
            if(curr.next != null){
                Node next = curr.next;
                Node prev = curr;
                while (next != null){
                    if(curr.data == next.data){
                        Node next_next = next.next;
                        Node nodeToDelete = next;

                        //delete
                        prev.next = next_next;
                        next = next.next;
                        nodeToDelete.next = null;
                    }else {
                        next = next.next;
                        prev = prev.next;
                    }
                }
            }
            curr = curr.next;
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
