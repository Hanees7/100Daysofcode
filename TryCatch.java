
public class Trycatch {
    public static void main(String[] args) {
        int x,y;
        int a=10;
        int b=5;
        int c=5;
 try{
    x=a/(b-c);
    
 }
 catch(ArithmeticException e){
    y=a/(b+c);
    System.out.println(y);
 }
    }
}
