import java.util.Scanner;
public class Sum3 {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the 3 Numbers to find the max");
a=j.nextInt();
b=j.nextInt();
c=j.nextInt();
if(a>b && a>c){
    System.out.println("A is Max");
}
else if(b>c){
    System.out.println("B is Max");
}
else{
    System.out.println("C is max");
}

    }
}
