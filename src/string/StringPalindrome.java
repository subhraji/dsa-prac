package string;

public class StringPalindrome {
    public static void main(String[] args) {
        lengthOfString();
    }

    static void lengthOfString(){
        char str[] = {'p','a','i'};
        int count = 0;

        for(int i = 0; str[i] != 'i'; i++){
            count++;
        }

        System.out.println(count);
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
