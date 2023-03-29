import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str = " hanees";
        String str1 = " Aneeh";

        // Convert into lower case
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        // Check length is same or not
        if (str.length() == str1.length()) {

            // convert in char array
            char ch[] = str.toCharArray();
            char ch1[] = str1.toCharArray();

            // Sort the array
            Arrays.sort(ch);
            Arrays.sort(ch1);

            // check sorted array is same or not
            boolean res = Arrays.equals(ch, ch1);
            if (res == true) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
        // If length is not same
        else {
            System.out.println("length not same");
        }
    }
}
