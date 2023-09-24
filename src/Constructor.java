public class Constructor {
    public static void main(String[] args) {
        Test test = new Test(2);
        test.show();
    }
}

class Test{
    int a;
    String b;

    private Test(){
        a = 10;
        b = "simi";
    }

    public Test(int a){

    }

    void show(){
        System.out.println(a+"..."+b);
    }
}