import java.util.*;
public class RotatedArraySort {
public static void Rot(int arr[], int k){
k %= arr.length;
//   Reverse the array
Rev(arr, 0, arr.length-1)
  
  Rev(arr, 0, k-1);
  
  Rev(arr, k, arr.length-1);
  for(int i=0; i<arr.length; i++){
  System.out.println(arr[i]);
    }
}
  public static void Rev(int arr[], int start, int end){
    while(start < end ){
    int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      ++start;
      --end;
    }
  }
   public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int k = 3;
        Rotate(arr, k);
    }
}

OUTPUT:-
0
1
2
4
5
6
7
