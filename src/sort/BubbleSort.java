package sort;

public class BubbleSort {
    public static void main(String[] args) {
        sort2();
    }

    //method 1
    static void sort1(){
        int[] arr = {5,3,2,10,4};
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }

        for (int j: arr){
            System.out.println(j);
        }
    }

    //method 2
    static void sort2(){
        int[] arr = {5,3,2,10,4};

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int j: arr){
            System.out.print(j+",");
        }
    }
}
