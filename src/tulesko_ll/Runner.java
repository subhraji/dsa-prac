package tulesko_ll;

public class Runner {
    public static void main(String[] args){

        LL list = new LL();
        AddTwoNumberByLL ll2 = new AddTwoNumberByLL();
        RemoveDuplicateEle ll3 = new RemoveDuplicateEle();
        ReverseEveryKNode ll4 = new ReverseEveryKNode();
        /*list.insertInt(1);
        list.insertInt(0);
        list.insertInt(2);
        list.insertInt(1);
        list.insertInt(2);
        list.show();
        list.mergeTwo0s1sLinkedList();
        list.show();*/
        //System.out.print(list.checkPalindrome2());

        ll4.solve();
    }
}
