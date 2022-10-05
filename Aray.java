import java.util.*;

public class Aray {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Enter the Elements");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            
        {
            a[i] =s1.nextInt();
        }

        System.out.println("/nArray Elements");
        for (int b : a)
            System.out.print(b + "   ");

    }
}
