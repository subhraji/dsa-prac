package pattern;

public class TrianglePattern {
    public static void main(String[] args) {
        pattern2();
    }

    static void pattern1(){
        int n = 4;
        for (int i = 1; i<=n; i++){
            int j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }
    }

    static void pattern2() {
        int n = 4;
        for (int j = 1; j<=n; j++) {
            for (int i = 0; i < n-j+1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
