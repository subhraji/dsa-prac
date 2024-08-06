package linked_list;

public class LList {

    NNode head;
    private int size;

    LList(){
        size = 0;
    }

    class NNode{
        String data;
        NNode next;

        NNode(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {
        LList list = new LList();
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.addFirst("this");
        list.addLast("end");
        list.printLList();
        list.reverseList();
        list.printLList();
        list.deleteLast();
        /*list.deleteFirst();
        System.out.println();
        list.printLList();
        System.out.println();
        System.out.println(list.getSize());*/
    }


    public void addFirst(String data) {

        NNode newNode = new NNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }


    public void addLast(String data){
        NNode newNode = new NNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        NNode currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null){
            head = null;
        }

        NNode lastNode = head.next;
        NNode secondLast = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }


        NNode prevNode = head;
        NNode currNode = head.next;

        while (currNode != null){
            NNode nextNode = currNode.next;
            currNode.next = prevNode;


            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public int getSize(){
        return size;
    }

    public void printLList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        NNode currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

}
