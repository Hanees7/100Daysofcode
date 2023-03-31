import java.util.*;

public class MaxProSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nrrnys Length");
        int maxx = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int start = 0;
        int end = 0;
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product += b[j];
                if (product > maxx) {
                    maxx = product;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("max subarray product = " + maxx);
        System.out.println("index of max subarray elements");
        for (int i = start; i <= end; i++) {
            System.out.println(b[i]);
        }
    }
}
