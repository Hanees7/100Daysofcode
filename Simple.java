import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner d=new Scanner (System.in);
int p,r,t;
System.out.println("Enter The values of p, r, t");
p=d.nextInt();
r=d.nextInt();
t=d.nextInt();
int si=(p*r*t)/100;
System.out.println("Answer is:"+si);

    }
}
