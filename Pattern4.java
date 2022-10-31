import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        int n;
        Scanner st=new Scanner(System.in);
        System.out.println("Enter the nombers of rows");
        n=st.nextInt();
        for(int a=1;a<=n;a++)
{
    for(int b=1;b<=n-a;b++)
    System.out.print(" ");
    for(int c=1;c<=a;c++)
System.out.print(c);
System.out.println(" ");
}
    }
}
