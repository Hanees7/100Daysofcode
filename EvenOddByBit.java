import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int a = n & 1;
        if (a == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
