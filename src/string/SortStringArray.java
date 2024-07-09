package string;

import java.util.ArrayList;

public class SortStringArray {
    public static void main(String[] args) {
        sort2();
    }

    public static void sort1(){
        String[] arr = {"red","green","blue","green"};
        ArrayList<String> newArr = new ArrayList<String>();

        for (int r = 0; r < arr.length; r++){
            if(arr[r] == "red"){
                newArr.add(arr[r]);
            }
        }
        for (int b = 0; b < arr.length; b++){
            if(arr[b] == "blue"){
                newArr.add(arr[b]);
            }
        }
        for (int g = 0; g < arr.length; g++){
            if(arr[g] == "green"){
                newArr.add(arr[g]);
            }
        }

        for (int i = 0; i < newArr.size(); i++){
            System.out.print(newArr.get(i)+",");
        }
    }

    public static void sort2(){
        String[] arr = {"red","green","blue","green"};
        int posCount = 0;

        for (int r = 0; r < arr.length; r++){
            if(arr[r] == "red"){
                String temp = arr[posCount];
                arr[posCount] = arr[r];
                arr[r] = temp;
                posCount++;
            }
        }
        for (int b = 0; b < arr.length; b++){
            if(arr[b] == "blue"){
                String temp = arr[posCount];
                arr[posCount] = arr[b];
                arr[b] = temp;
                posCount++;
            }
        }
        for (int g = 0; g < arr.length; g++){
            if(arr[g] == "green"){
                String temp = arr[posCount];
                arr[posCount] = arr[g];
                arr[g] = temp;
                posCount++;
            }
        }


        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
}
