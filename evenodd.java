import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a;
       
        System.out.println("Enter the number");
        a=s1.nextInt();
        if(a%2==0){
            System.out.println("The number is  Even");
        }
        else{
            System.out.println("The Number is Odd");
        } 
           
        
    }
}
