import java.util.*;
public class Alpha41 {

public static int factorial(int a){
    int i=1;
    for(int j=1;j<=a;j++){
        i*=j;
    }
return i;
}
public static int bino(int x, int y){
    int num=factorial(x);
    int num2=factorial(y);
    int num3=factorial(x-y);
    int binocof=num/(num2*num3);
    return binocof;

}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N");
        int x=sc.nextInt();
        System.out.println("Enter the value of R");
        int y=sc.nextInt();
 System.out.println("The coefficient is : "+bino(x,y));
}
}
