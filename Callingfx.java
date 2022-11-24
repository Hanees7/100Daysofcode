import java.util.*;
public class Callfx {
    public static void hello(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.println("Hello");

    }
    public static void summ(int num1,int num2){
        int c=num1+num2;
System.out.println(c);
    }
    public static int sum(int num1,int num2){//formal parametr and  parametrs 
        int c=num1+num2;
return c;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    hello();
    System.out.println("Enter value for sum");
    int x=sc.nextInt();
    int y=sc.nextInt();
    summ(x,y);
    System.out.println(" One more time sum");
    int a=sc.nextInt();
    int b=sc.nextInt();
 
    int c=sum(a,b);//Passing Arguments OR Actual parameters
    System.out.println(c);
}

}
