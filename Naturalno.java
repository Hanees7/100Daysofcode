import java.util.Scanner;
public class Naturalno {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int a,sum=0;
        System.out.println("Enter the value");
        a=s.nextInt();
        for(int val=1;val<=a;val++)
        {
            sum=sum+val;
            //System.out.println(sum);
        }
        System.out.println(sum);

    }
    
}
