package strings;

import java.util.HashSet;
import java.util.Set;

public class Strings {

    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.repetitionNumberString();
    }

    private void reverseString(){
        String str = "hello";
        StringBuilder stringBuilder = new StringBuilder(str);

        int  i = 0;
        int j = stringBuilder.length()-1;

        while (i<j){

            char start = stringBuilder.charAt(i);
            char end = stringBuilder.charAt(j);

            stringBuilder.setCharAt(i, end);
            stringBuilder.setCharAt(j, start);

            str = stringBuilder.toString();
            i++;
            j--;
        }

        System.out.println(str);
    }

    private void findName(){
        String email = "subhrajitdeb@gmail.com";
        String name = "";

        for (int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }

            name = name+email.charAt(i)+"";
        }

        System.out.println(name);
    }

    private void toggleCamelCaseString(){
        String str = "phYSicS Hello";
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i<stringBuilder.length(); i++){
            char ch = stringBuilder.charAt(i);

            if(ch == ' ') continue;

            int ascii = (int)ch ;

            if(ascii <= 90){
                ascii += 32;
                char newChar = (char)ascii;
                stringBuilder.setCharAt(i, newChar);
            }else {
                ascii -= 32;
                char newChar = (char)ascii;
                stringBuilder.setCharAt(i, newChar);
            }
        }

        System.out.println(stringBuilder.toString());
    }

    private void toggleCamelCaseString2(){
        String str = "phYSicS Hello";
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            int ascii = (int)ch ;

            if(ascii <= 90){
                ascii += 32;
                char newChar = (char)ascii;
                str = str.substring(0,i)+newChar+str.substring((i+1));
            }else {
                ascii -= 32;
                char newChar = (char)ascii;
                str = str.substring(0,i)+newChar+str.substring((i+1));
            }
        }

        System.out.println(str);
    }

    private void palindromeSubstring(){
        String str = "Hellol";
        for (int i = 0; i<str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                String subString = str.substring(i,j);
                String revStr = reverseString(subString);
                if(subString.equals(revStr)){
                    System.out.println(subString);
                }
            }
        }
    }

    private String reverseString(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        int i = 0;
        int j = stringBuilder.length()-1;

        while (i<j){
            char start = stringBuilder.charAt(i);
            char end = stringBuilder.charAt(j);
            stringBuilder.setCharAt(i, end);
            stringBuilder.setCharAt(j, start);

            i++;
            j--;
        }

        return stringBuilder.toString();
    }

    private void reverseEachWord(){
        String str = "i am inside the room";
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0,sb.length());
            }
        }

        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }

    private void repetitionNumberString(){
        String str = "aabbdcc";
        String ans = "";


        for (int i = 0; i<str.length(); i++){
            int count = 1;
            for (int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    if(j==str.length()-1){
                        ans += str.charAt(i)+""+count;
                    }
                }else {
                    i = j-1;
                    ans += str.charAt(i)+""+count;
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    private void substring(){
        String str = "school";
        Set<String> uniqueSubstrings = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                uniqueSubstrings.add(substring);
            }
        }

        for (String substring : uniqueSubstrings) {
            System.out.println(substring);
        }
    }
}
