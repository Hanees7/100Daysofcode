import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        
        int a[]=new int[3];
        int b[]=new int[3];
        int Alice=0;
        int Bob=0;
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }       
        for(int i=0; i<a.length; i++){
            b[i]=sc.nextInt();
        }   
         for(int i=0; i<a.length; i++){
             if(a[i]>b[i]){
                 Alice=Alice +1;
             }
             else if(a[i]<b[i]){
                 Bob = Bob+1;
             }
             
         }
         System.out.print(Alice+" ");
         System.out.print(Bob);
    }
}
