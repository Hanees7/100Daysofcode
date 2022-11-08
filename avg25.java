import java.util.Scanner;
public class avg25{
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
int n=5;
int sum=0;
System.out.println("Enter the 5 values");
for(int i=1;i<=n;i++){
   
    int a=sc.nextInt();
    
    sum=sum+a;
}
int result=sum/n;
System.out.println("the Avg of 5 Numbers"+result);


    }
}