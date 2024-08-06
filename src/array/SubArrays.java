package array;

public class SubArrays {

    public static void main(String[] args) {
        problem1();
    }

    //subarrays of sum k
    public static void problem1(){
        int[] arr = {1,2,3,4,-4};
        int k = 5;
        int sum = 0;
        int subArrayCount = 0;

        for (int i = 0; i < arr.length; i++){

            sum = 0;
            sum = sum + arr[i];

            for (int j = i+1; j< arr.length; j++){

                sum = sum + arr[j];
                if(sum == k){
                    subArrayCount ++;
                }
            }
        }

        System.out.println("Total sub array = "+subArrayCount);
    }
}


