import java.util.*;
public class Alpha12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a =sc.nextInt();

        boolean x=(a%4==0);
        boolean y=(a%100!=0);
        boolean z=(a%100==0 && a%400==0);

        if(x &&(y || z)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap Year");
        }

    }
}
