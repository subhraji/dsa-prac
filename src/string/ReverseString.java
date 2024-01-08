package string;

import java.sql.Array;
import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Dinesh Kumar";
        String rev= "";

        String[] strList = str.split(" ");

        for (String i : strList){
            char[] wordList = i.toCharArray();
            for(int k = wordList.length-1; k>=0; k--){
                rev += wordList[k];
            }
            rev += " ";
        }


        String[] revStrList = rev.split(" ");
        rev = "";
        for(int i = revStrList.length-1; i>=0; i--){
            rev += revStrList[i];
            rev += " ";
        }

        System.out.println(rev);
    }
}
