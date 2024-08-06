package array;

import java.util.HashSet;
import java.util.Set;

public class SortArray {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.insertionSort();
    }

    private void bubbleSort(){
        int[] arr = {2,7,3,8,9,1};
        boolean isSwapped = true;

        while (isSwapped){
            isSwapped = false;

            for (int i = 0; i<arr.length-1; i++){
                for (int j = i+1; j<arr.length; j++){

                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        isSwapped = true;
                    }
                }
            }
        }

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private void bubbleSort2(){
        int[] arr = {2,7,3,0,8,9,1};
        boolean isSwapped = true;

        while (isSwapped){
            isSwapped = false;

            int i = 0;
            int j = i+1;
            while (i<arr.length-1 && j<arr.length){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    isSwapped = true;
                }

                i++;
                j++;
            }
        }

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }


    private void selectionSort(){

        int[] arr = {2,7,3,0,8,9,1};

        for (int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for (int j = i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }

    private void insertionSort(){
        int[] arr = {7,8,3,1,2};

        for (int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
