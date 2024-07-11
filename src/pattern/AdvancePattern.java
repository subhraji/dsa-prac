package pattern;

public class AdvancePattern {
    public static void main(String[] args) {
        AdvancePattern advancePattern = new AdvancePattern();
        advancePattern.diamondPattern2();
    }

    private void butterflyPattern(){
        int n = 4;
        for (int i = 1; i<= n; i++){

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for (int m = n; m>i; m--){
                System.out.print(" ");
            }
            for (int m = n; m>i; m--){
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i<= n; i++){

            for (int m = n; m>=i; m--){
                System.out.print("*");
            }
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for (int m = n; m>=i; m--){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    private void rectangle2(){
        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j = n-1; j>=i; j--){
                System.out.print("-");
            }

            for (int j =1 ; j<=i; j++){
                System.out.print("*");
            }

            for (int j = n-1; j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private void numberPyramid(){
        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    private void palindromeNumberPyramid(){
        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }


            int k = i;
            for (int j = 1; j<=i; j++){
                System.out.print(k);
                k--;
            }


            int l = 2;
            for (int j = 1; j <= i-1; j++){
                System.out.print(l);
                l++;
            }
            System.out.println();
        }
    }


    private void diamondPattern(){
        int n = 5;
        for (int i = 1; i<=n; i++){

            for (int j = n-i; j>=1; j--){
                System.out.print(" ");
            }

            for (int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i<=n; i++){
            for (int j = 2; j<=i; j++){
                System.out.print(" ");
            }

            for (int j = 2*n-i; j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private void diamondPattern2(){
        int n = 5;

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for (int j = 2; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i<= n; i++){

            for (int j = 2; j<=i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <=n-i+1; k++){
                System.out.print("*");
            }

            for (int k = 2; k <=n-i+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
