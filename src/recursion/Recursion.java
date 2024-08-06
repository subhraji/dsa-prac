package recursion;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        /*int ans = recursion.calcFactorial(3);
        System.out.println(ans);*/

        /*int a = 0; int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        recursion.printFibonacci(a, b, n-2);*/

        //recursion.towerOfHanoi(3, "S", "H", "D");

        //String str = "aabcdaf";
        //recursion.reverseString(str, str.length()-1);

        //recursion.firstLastOccurrence(str, 0, -1, -1);

        /*int[] arr = {1,3,5};
        System.out.println(recursion.isSorted(arr, 0));*/

        String str = "axbxxcd";
        recursion.moveAllxToEnd(str, 0, 0, "");
    }

    private void substrac(int n){
        if(n == 0) {
            return ;
        }

        System.out.println(n);

        substrac(n-1);
    }

    private void problem2(int n, int i, int sum){
        if(i > n){
            System.out.println(sum);
            return;
        }

        sum = sum+i;
        i++;
        problem2(n, i, sum);
        System.out.println(i);
    }

    private int calcFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int fac_nm1 = calcFactorial(n-1);
        int fac = n * fac_nm1;
        return fac;
    }

    private void printFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c = a+b;
        System.out.println(c);

        printFibonacci(b, c, n-1);

    }

    private void printFibonacci2(){
        int a = 0;
        int b = 1;
        System.out.println(0);
        System.out.println(1);

        for (int i = 1; i<=5; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    private void towerOfHanoi(int n, String src, String helper, String dest){

        if (n==1){
            System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+ src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);

    }

    private void reverseString(String str, int idx){
        if (idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

    private void firstLastOccurrence(String str, int idx, int lastPos, int firstPos){
        if(idx == str.length()-1){
            if(str.charAt(idx) == 'a'){
                lastPos = idx;
            }
            System.out.println("last occurrence index is: "+lastPos);
            System.out.println("first occurrence index is: "+firstPos);
            return;
        }

        if(str.charAt(idx) == 'a'){
            lastPos = idx;

            if(firstPos == -1){
                firstPos = idx;
            }
        }
        firstLastOccurrence(str, idx+1, lastPos, firstPos);
    }

    private boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else {
            return false;
        }
    }

    private void moveAllxToEnd(String str, int idx, int count, String newString){

        if(idx == str.length()){
            for (int i = 0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(idx) == 'x'){
            count++;
            moveAllxToEnd(str, idx+1, count, newString);
        }else {
            newString += str.charAt(idx);
            moveAllxToEnd(str, idx+1, count, newString);
        }
    }
}


