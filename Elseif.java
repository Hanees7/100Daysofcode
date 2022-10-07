import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
     int marks;
System.out.println("enter your marks:");
     Scanner exam=new Scanner(System.in);
     marks=exam.nextInt();

if(marks>=60 && marks<=100){
    System.out.println("1");


}
else if(marks>=45 && marks<60){
System.out.println("2");
}
else if(marks>=33 && marks<45){
System.out.println("3");


}
else{
    System.out.println("FAIL");
}

    }
}
