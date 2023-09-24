import java.util.ArrayList;

public class Gfg {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = 6;
        int s = 11;
        System.out.println(subarraySum(arr, n, s));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int sum = 0;
        int i = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for(int j = 0; j<n; j++){
            if(sum+arr[j]<=s){
                sum += arr[j];
            }else{
                sum += arr[j];
                while(sum>s){
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum == s){
                newArray.add(i+1);
                newArray.add(j+1);
                return newArray;
            }
        }

        newArray.add(-1);
        return newArray;
    }


    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, sum = 0;

        while (j < n) {
            sum += arr[j];

            while (sum > s) {
                sum -= arr[i];
                i++;
            }
            if ((sum == s) && (i<=j)) {
                result.add(i + 1);
                result.add(j + 1);
                return result;
            }

            j++;
        }

        result.add(-1);
        return result;
    }

    static ArrayList<Integer> subarraySum3(int[] arr, int n, int s)
    {
        int sum = 0;
        int i = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for(int j = 0; j<n; j++){
            sum += arr[j];
            while(sum>s){
                sum -= arr[i];
                i++;
            }
            if((sum == s) && (i<=j)){
                newArray.add(i+1);
                newArray.add(j+1);
                return newArray;
            }
        }

        newArray.add(-1);
        return newArray;
    }

    private static void printArray(int arr[]){
        for (int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]);
        }
    }
}
