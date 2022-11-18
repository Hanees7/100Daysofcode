import java.util.*;
public class Incometax2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income");
        int income=sc.nextInt();
   int tax; 
        if(income <500000){
tax=0;
income-=tax;    
}
    else if(income >=500000 && income <=1000000){
        tax=(int)(income*0.2);
    income-=tax;
    }
    else{
        tax=(int)(income*0.3);
        income-=tax;
    }
System.out.println("Your Tax is  : "+ tax );
System.out.println("Your Current income  is  : "+ income );
}
}
