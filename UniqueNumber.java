import java.util.*;

public class UniqueNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the 1st No.");
        int Num1 = sc.nextInt();
        System.out.println("Enter the 1st No.");
        int Num2 = sc.nextInt();
        for (int i = Num1; i <= Num2; i++) {
            int Number = i;
            int digit = Number % 10;
            Number /= 10;
            int digit2 = Number % 10;
            if (digit != digit2) {
                count++;

            }

        }
        System.out.println("The number Unique No is: "+count);
    }
}
