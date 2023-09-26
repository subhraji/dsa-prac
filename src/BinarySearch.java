import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,4,7,45,78,99,101};
        int num = 99;
        System.out.println(binarySearch(arr, num));
    }

    static Integer binarySearch(int arr[], int num){

        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if(num == arr[mid]){
                return mid;
            }

            if(num>arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return -1;
    }
}

