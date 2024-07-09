package pattern;

public class RectanglePattern {

    public static void main(String[] args) {
        RectanglePattern rectanglePattern = new RectanglePattern();
        rectanglePattern.drawHollowRectangle();
    }


    private void drawRectangle(){
        int n = 4;

        for (int i = 0; i<n; i++){ //row

            for (int j = 0; j<=n; j++){ //column
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private void drawHollowRectangle(){
        int n = 4;
        int m = 5;
        for (int i = 0; i<n; i++){ //row

            for (int j = 0; j<m; j++){ //column
                if(i == 0 || j == 0 || i == n-1 || j == m-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }
}
