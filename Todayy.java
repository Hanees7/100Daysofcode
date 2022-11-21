import java.util.*;

public class Alpha21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        do {
            int i = sc.nextInt();
            if (i % 10 == 0) {
                System.out.println("Exit");
                break;
            }
            System.out.println("Your Number is : " + i);

        } while (true);

    }
}
