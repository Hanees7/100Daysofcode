import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        
int a,b,c,d;
System.out.print("Enter 1 no: ");

Scanner s=new Scanner (System.in);
a=s.nextInt();
System.out.print("Enter 2 no: ");
b=s.nextInt();
System.out.println("1=+ ," +"  2=* ,"+"3=- ,"+"4=/ ,"+"5=% ");
System.out.println("Task perform");
c=s.nextInt();

switch(c){

case 1:c=a+b;
System.out.println("Addition: "+c);
break;
case 2:c=a*b;
System.out.println("Multiply: "+c);
break;
case 3:c=a-b;
System.out.println("Subtract: "+c);
break;
case 4:c=a/b;
System.out.println("Divide: "+c);
break;
case 5:c=a%b;
System.out.println("Remainder: "+c);
break;
default:System.out.println("Select the correct");
}




    }
    
}
