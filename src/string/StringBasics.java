package string;

public class StringBasics {
    public static void main(String[] args) {
        palindrome();
    }

    public static void toggle(){
        StringBuilder str = new StringBuilder("PHysiCs ju");
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int intCh = (int)ch;
            if(intCh <= 90){
                intCh += 32;
                char newCh = (char)intCh;
                str.setCharAt(i, newCh);
            }else if(intCh >= 97){
                intCh -= 32;
                char newCh = (char)intCh;
                str.setCharAt(i, newCh);
            }
        }

        System.out.println(str);
    }

    public static void palindrome(){
        String str = "aabaa";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag == false){
            System.out.println("not palindrome");
        }else {
            System.out.println("palindrome");
        }
    }
}
