public class Fibbonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 1; i<=10; i++){
            int temp = b;
            b = a+b;
            a=temp;
            System.out.print(b+" ");
        }
    }



    ////type 2

    static int a = 0;
    static int b = 1;
    static int sum = 0;
    static int n = 20;

    static void fibonacci(){
        while (n>0){
            System.out.print(a+" + ");
            sum = a+b;
            a=b;
            b= sum;
            n --;
            fibonacci();
        }
    }
}
