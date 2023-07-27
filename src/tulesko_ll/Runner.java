package tulesko_ll;

public class Runner {
    public static void main(String[] args){

        LL list = new LL();

        list.insertInt(5);
        list.insertInt(10);
        list.insertInt(3);
        list.insertInt(7);
        list.show();
        list.deleteAtPos(1);
        list.show();
    }
}
