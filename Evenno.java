import java.util.Scanner;
public class Evenno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter the Number Between 9 and 100");
        a=s.nextInt();
if(a>=9 && a<=100){
 if(a%2==0)
 {
    System.out.println("Even");
}
else{
    System.out.println("Odd");  
}
}

else{
    System.out.println("Please Enter no. between 9 to 100");
}
  }
}
