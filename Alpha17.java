import java.util.*;
public class Alpha17 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number You Want to Reverse");
int a=sc.nextInt();
while(a>0){
int b=a%10;
System.out.print(b);
a=a/10;
}
System.out.println();
    }
}
