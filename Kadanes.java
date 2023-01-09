import java.util.*;
public class Kadanes {
    public static void Kadnes(int Numm[]){
int MaxSum = 0;
int CurrentSum = 0;
for(int i=0; i<Numm.length; i++){
    CurrentSum+=Numm[i];
    if( CurrentSum < 0){
        CurrentSum = 0;
    }
    MaxSum=Math.max(MaxSum, CurrentSum);
}
System.out.println(MaxSum);
    }
    public static void main(String[] args) {
        int Numm[]={-2, -3, 4, -1, -2, 1, 5, -3};
        Kadnes(Numm);
    }
}
