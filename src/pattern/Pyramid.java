package pattern;

public class Pyramid {

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.zeroOneLeftPyramid2();
    }

    private void leftHalfPyramid(){
        int n = 4;

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();
        }

    }

    private void leftHalfPyramid2(){
        int n = 5;

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=i; j++){

                System.out.print("*");
            }

            i++;
            System.out.println();
        }
    }



    private void rightHalfPyramid2(){
        int n = 4;

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }


    private void reverseLeftHalf(){

        int n = 4;

        for(int i = 1; i<=n; i++){

            /*for (int j = n; j>i; j--){
                System.out.print("-");
            }*/
            for (int j = 1; j<=n-i; j++){
                System.out.print("-");
            }

            for (int m = 1; m <= i; m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private void numberLeftPyramid(){
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    private void invertedNumberLeftPyramid(){

        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    private void numberLeftPyramid2(){
        int n = 5;
        int k = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(k+" ");
                k++;
            }

            System.out.println();
        }
    }

    private void zeroOneLeftPyramid2(){
        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= i; j++){
                int s= i+j;
                if(s % 2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }
}
