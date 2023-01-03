import java.util.*;
public class ReverseArray {
    public static void Reverse(int num[]){
int first = 0; int last = num.length-1;
while(first < last){
    // Swap the value
    int temp=num[last];
    num[last] = num[first];
    num[first] = temp;

    first++;
    last--;
}    
}
    public static void main(String[] args) {
        int num[] = {10, 8, 6, 4, 2};
         
        Reverse(num);
        //Print the Array
        for(int i=0; i<num.length;i++)
    {
        System.out.print(num[i]+" ");
     }
    System.out.println();
    }
}
