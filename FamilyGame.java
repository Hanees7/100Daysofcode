import java.util.*;

public class FamilyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        
        boolean narr[] = new boolean[n];
        int j, i;
        for (i = 0, j = 0; n > 1; i++) {
            if (narr[i] == false) {
                if (str.charAt(j) == 'y') {
                    narr[j] = true;
                    j++;
                    n--;
                } else {
                    j++;
                }

            }

            i++;
            if (i >= narr.length - 1) {
                i = 0;
            }
            if (j >= str.length() - 1) {
                j = 0;
            }
        }
        for (int k = 0; k < narr.length; k++) {
            if (narr[k] == false) {
                System.out.println(k + 1);
                break;
            }
        }
    }
}
