import java.util.Scanner;
public class Primes
 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
int a;
int div=2;
System.out.println("Enter The Value");
a=S.nextInt();
while(div<a){
    if(a%div==0){
        System.out.println("No Prime");
        break;
    }
    else{
        
        System.out.println("Prime");
    break;
    }
}
     }
    
}
