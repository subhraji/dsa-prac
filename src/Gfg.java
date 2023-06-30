public class Gfg {
    public static void main(String args[]){
        int a[] = {1,3,4,6,7,8,9,0,40,50,60};
        int k = 4;
        int ko = 4;
        int p = 0;
        while (k<=a.length){
            int s = p;
            int e = k-1;
            while (e>s){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }

            p += k;
            k += ko;
        }

        if(p-ko < a.length-1){
            int s = p-ko;
            int e = a.length-1;
            while (e>s){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }

        printArray(a);
    }

    private static void printArray(int arr[]){
        for (int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]);
        }
    }
}
