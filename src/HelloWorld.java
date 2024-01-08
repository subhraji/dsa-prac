import java.sql.Array;
import java.util.*;

public class HelloWorld {
    public static void main(String args[]){
        /*int array[] = {0,1,4,2,0};
        int s = 0;
        int e = array.length-1;
        int mid = (s+e)/2;
        while (s<e){
            if(array[mid]<array[mid+1]){
                s = mid+1;
            }else {
                e = mid;                          b
            }
            mid = (s+e)/2;
        }
        System.out.println(s);*/

        //System.out.println(binarySearch());

        int array[] = {1,2,3,4,5};
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }

    private static void largeNumber(int []digits){

        if(digits.length == 1){
            if(digits[digits.length-1] == 9){
                int newArray[] = new int[2];
                newArray[0] = 1;
                newArray[1] = 0;
                printlist(newArray);
            }else {
                digits[0] += 1;
                printlist(digits);
            }
        }else {
            for(int i = digits.length-1; i>= 0; i--){
                if(digits[i] != 9){
                    digits[i] += 1;
                    break;
                }else {
                    if(digits[i] == 9 && digits[i-1] == 9){
                        digits[i] = 0;
                    }else if(digits[i] == 9 && digits[i-1] != 9) {
                        digits[i] = 0;
                    }else {
                        digits[i] += 1;
                        break;
                    }
                }
            }
            printlist(digits);
        }

    }

    private static void printlist(int array[]){
        for (int w: array){
            System.out.print(w);
        }

    }

    private static int insertPosition(){
        List<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(6);
        array.add(8);
        int target = 8;
        int i;
        for(i = 0; i<=array.size()-1; i++){
            if(array.get(i) == target){
                return  i;
            }else {
                if(target < array.get(i)){
                    array.set(i, target);
                    break;
                }
            }
        }
        return i;
    }

    private static int firstIndex(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == key){
                ans = mid;
                end = mid-1;
            }
            if(key<arr[mid]){
                end = mid-1;
            }else if(key>arr[mid]){
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    private static int lastIndex(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == key){
                ans = mid;
                start = mid+1;
            }
            if(key<arr[mid]){
                end = mid-1;
            }else if(key>arr[mid]){
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        return ans;
    }

    private static void printArray(int[] drr){
        for (int j = 0; j< drr.length; j++){
            System.out.println(drr[j]);
        }
    }

    private static void pyramid(){
        int row = 4;
        /*for (int i=0; i<row; i++)
        {
            for (int j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i<row; i++){
            for(int s = 1; s <= i; s++){
                System.out.print(" ");
            }

            for (int j = 1; j<= row-i; j++){
                System.out.print("* ");
            }


            System.out.print("\n");
        }*/

        /*int row = 4;
        for (int m = 1; m <= row; m++)
        {
            for (int n=row; n>m; n--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(m * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int j = 1; j<=5; j++){
            for(int i = 1; i<= 5-j+1; i++){
                System.out.print(i);
            }

            for(int s = 1; s<=j-1; s++){
                System.out.print("*");
            }

            for(int t = 1; t<=j-1; t++){
                System.out.print("*");
            }

            for(int k = 5-j+1; k>=1; k--){
                System.out.print(k);
            }

            System.out.print("\n");
        }*/

        /*int n = 3;
        for(int i = 0; i < n; i++){

            for(int s = 1; s<=n-i; s++ ){
                System.out.print(" ");
            }

            for(int j = 0; j<=i; j++){
                System.out.print((char) ('A' + i)+" ");
            }

            System.out.print("\n");
        }*/

        int n = 4;
        for(int i = 0; i < n; i++){
            for(int s = 0; s<=i; s++ ){
                System.out.print((char) ('A' +s+i));
            }
            System.out.print("\n");
        }
    }


    static int binarySearch(){
        int arr[] = {1,3,5,7,10,80};
        int key = 10;
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                ans = mid;
                return ans;
            }

            if (key < arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}

