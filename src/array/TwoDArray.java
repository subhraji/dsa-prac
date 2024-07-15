package array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        twoDArray.printTwoDArray();
    }

    private void printTwoDArray(){

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        //input
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
