import java.util.*;

public class HyfinRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String using _ sign");
        String str = sc.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                ans = ans + (str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '_') {
                ans = ans + (str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }
}
