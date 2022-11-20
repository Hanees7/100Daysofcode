import java.util.*;
public class Alpha28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int fact=1;
        System.out.print("Enter the Any positive number : ");
        int num=sc.nextInt();
for(int i=1;i<=num;i++){
    fact*=i;
    
}
System.out.print("Factorial is : "+fact);
    }
    
}
