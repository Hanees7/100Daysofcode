import java.util.*;
public class Hollowrect {
    public static void hollow(int row,int col){

for(int i=1;i<=row;i++){
for(int j=1;j<=col;j++){
if(i==1 || i==row|| j==1|| j==col ){
    System.out.print("* ");
}
else{
    System.out.print("  ");
}

}
System.out.println(" ");
}
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of Row : ");
    int row=sc.nextInt();
    System.out.println("Enter the value of col : ");
    int col=sc.nextInt();
hollow(row, col);
}


}
