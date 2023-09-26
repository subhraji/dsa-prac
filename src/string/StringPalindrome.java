package string;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(stringPalindrome("paoapi"));
    }

    static boolean stringPalindrome(String str){
        String rev = "";
        char strArr[] = str.toCharArray();

        for (int i = strArr.length-1; i>=0; i--){
            rev = rev+strArr[i];
        }

        if(str.equals(rev)){
            return true;
        }else {
            return false;
        }
    }
}
