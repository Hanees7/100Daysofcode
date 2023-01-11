An element of the array can store water if there are higher bars on the left and the right. 
The amount of water to be stored in every position can be found by finding the heights of bars on the left and right sides. 
The total amount of water stored is the summation of the water stored in each index.
For example – Consider the array arr[] = {4, 2, 0, 6, 3, 2, 5}. 
Three units of water can be stored in two indexes 1 and 3, and one unit of water at index .
Water stored in each index = 4 + 2 + 0 + 6 + 3 + 2 + 5 = 11  
  
  
OUTPUT:-  
import java.util.*;
public class TrappedWater {
public static int RainWater(int arr[]){

int n=arr.length;
//find the left max Boundary
int LeftArray[] = new int[n] ;
LeftArray[0]=arr[0];
for(int i=1; i<n; i++){
    LeftArray[i]=Math.max(arr[i], LeftArray[i-1]);

}
//find the right max boundARY
int RightArray[]=new int[n];
RightArray[n-1]= arr[n-1];
for(int i=n-2; i>=0; i--){
    RightArray[i]=Math.max(arr[i], RightArray[i+1]);
}
int Trapewater = 0;
//loop

for(int i= 0; i<n; i++){

    int Waterlevel = Math.min(LeftArray[i], RightArray[i]);

    Trapewater +=Waterlevel - arr[i];
}




return Trapewater;

}




    public static void main(String[] args) {
        int arr[]={4, 2, 0, 6, 3, 2, 5};
        System.out.println(RainWater(arr));

    }
}
