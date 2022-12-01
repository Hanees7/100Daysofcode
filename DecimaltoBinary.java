import java.util.*;
public class Dectobin {
    public static void dectobin(int Decnum) {
        int my = Decnum;
        int pow = 0;
        int binNum = 0;
        while (Decnum > 0) {
            int rem = Decnum % 2;
            binNum += (rem * (int) Math.pow(10, pow));
            pow++;
            Decnum /= 2;
        }
        System.out.println(my + " = " + binNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int D=sc.nextInt();
        dectobin(D);
    }

}
