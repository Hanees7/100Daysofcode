An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  or .

Reverse an array of integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Example

Return .

Function Description

Complete the function reverseArray in the editor below.

reverseArray has the following parameter(s):

int A[n]: the array to reverse
Returns

int[n]: the reversed array
Input Format

The first line contains an integer, , the number of integers in .
The second line contains  space-separated integers that make up .

Constraints

Sample Input 1

CopyDownload
Array: arr
1
4
3
2

 
4
1 4 3 2
Sample Output 1

2 3 4 1
  
  OUTPUT :-
    
    import java.util.*;
public class Demo2 {
    public static void Reverse(int b[]){

        for(int j=b.length-1; j>=0; j--){
            System.out.print(b[j]+" ");
        
           }
            
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter ur no");
        int a=sc.nextInt();
        int i;
        int b[]=new int[a];
        for(i=0; i<a; i++){
            b[i]=sc.nextInt();
        }
        // b[i]=sc.nextInt();
       Reverse(b);
        }
}
