import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner  s1=new Scanner(System.in);
System.out.println("Enter the value of pencil");
        float a=s1.nextFloat();
        System.out.println("Enter the value of Pen");
        float b=s1.nextFloat();
        System.out.println("Enter the Value Eraser");
        float c=s1.nextFloat();
        float total=a+b+c;
System.out.println("The Total Amount of Bill :"+total);
float newtotal=total+(18/100f*total);
System.out.println("The Bill with GST :"+newtotal);
    }
}
