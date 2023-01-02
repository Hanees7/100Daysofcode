import java.util.*;
public class BinarySearch {
    public static int binarysearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Comparison
            if (num[mid] == key) {// mid index value represents         //found
                return mid;
            }
            if (num[mid] < key) { // Right side or 2nd half
                start = mid + 1;
            } else { // Left ride or 1st half
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;
System.out.println("Index for key is : "+ binarysearch(num, key));
    }
}
