import java.util.*;
public class LinearLargest {
    public static int Largest(int Num[]){
        int Large=Integer.MIN_VALUE;//-Infinity
for(int j=0;j<Num.length;j++){
    if(Large<Num[j]){
        Large=Num[j];
    }

}
return Large;
    }


    public static void main(String[] args) {
        int Num[]={3,45,6,2,7,5,6,7,77};
System.out.println("The largest Value is : "+Largest(Num));
    }
}
