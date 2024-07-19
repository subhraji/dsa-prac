package bit;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        BitManipulation bitManipulation = new BitManipulation();
        bitManipulation.updateBitProblem();
    }

    private void getBitProblem(){
        int pos = 3;
        int n = 5;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }
    }

    private void setBitProblem(){
        int pos = 1;
        int n = 5;
        int bitmask = 1<<pos;

        int newNumber = (bitmask|n);
        System.out.println(newNumber);
    }

    private void clearBitProblem(){
        int n = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notBitmask = ~(bitmask);

        int newNumber = (notBitmask & n);
        System.out.println(newNumber);
    }

    private void updateBitProblem(){
        Scanner scanner = new Scanner(System.in);
        int updateNumber = scanner.nextInt();

        int n = 5; //0101
        int pos = 1;
        int bitmask = 1<<pos;

        if (updateNumber == 0){
            int notBitmask = ~(bitmask);
            int newNumber = (notBitmask & n);
            System.out.println(newNumber);
        }else {
            int newNumber = (bitmask | n);
            System.out.println(newNumber);
        }

    }
}
