import java.util.*;
public class Bintodec {
    
public static void bintodec(int binNum){
int num=binNum;
    int pow=0;
int Decno=0;

while(binNum>0){
int lastdigit=binNum%10;
    Decno+=(lastdigit*(int)Math.pow(2,pow));
    pow++;
    binNum/=10;
}
System.out.println(num+" = "+Decno);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter only Binary digits : ");
    int a=sc.nextInt();
    bintodec(a);
}

}
