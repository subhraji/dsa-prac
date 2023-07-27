package tulesko_ll;

public class LL {
    Node head;

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

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println("");
    }
}
