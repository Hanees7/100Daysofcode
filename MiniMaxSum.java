import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i <= 4; i++){
            long n = sc.nextLong();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
