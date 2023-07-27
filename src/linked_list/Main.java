package linked_list;

public class Main {
    public static void main(String args[]){
        LL list = new LL();
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.display();
        System.out.println("\n");
        list.oddAfterEvenLinkedList();
    }
}
