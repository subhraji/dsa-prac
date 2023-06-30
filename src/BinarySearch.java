import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BinarySearch {
    public static void main(String args[]){

        fibonacci();
    }

    static int a = 0;
    static int b = 1;
    static int sum = 0;
    static int n = 20;

    static void fibonacci(){
        while (n>0){
            System.out.print(a+" + ");
            sum = a+b;
            a=b;
            b= sum;
            n --;
            fibonacci();
        }
    }


    /*public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022, 01, 01, 10, 30, 0);
        LocalDateTime end = LocalDateTime.of(2022, 12, 31, 23, 59, 59);
        long minutesBetween = ChronoUnit.MINUTES.between(start, end);
        long hoursBetween = ChronoUnit.HOURS.between(start, end);
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println("Minutes between: " + minutesBetween);
        System.out.println("Hours between: " + hoursBetween);
        System.out.println("Days between: " + daysBetween);
    }*/
}

