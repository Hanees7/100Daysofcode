Given a sequence of  integers,  where each element is distinct and satisfies . For each  where , that is  increments from  to , find any integer  such that  and keep a history of the values of  in a return array.

Example


Each value of  between  and , the length of the sequence, is analyzed as follows:

, so 
, so 
, so 
, so 
, so 
The values for  are .

Function Description

Complete the permutationEquation function in the editor below.

permutationEquation has the following parameter(s):

int p[n]: an array of integers
Returns

int[n]: the values of  for all  in the arithmetic sequence  to 
Input Format

The first line contains an integer , the number of elements in the sequence.
The second line contains  space-separated integers  where .

Constraints

, where .
Each element in the sequence is distinct.
Sample Input 0

3
2 3 1
Sample Output 0

2
3
1
Explanation 0

Given the values of , , and , we calculate and print the following values for each  from  to :

, so we print the value of  on a new line.
, so we print the value of  on a new line.
, so we print the value of  on a new line.
Sample Input 1

5
4 3 5 1 2
Sample Output 1

1
3
5
4
2
  
  OUTPUT :-
    
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i = 0 ;i<n;i++)
            {
            int pos = 0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==i+1)
                {
                pos = j+1 ;
                    break;
                }
              }
            int pos1=0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==pos)
                {
                pos1 = j ;break;
            }
            }
            System.out.println(pos1+1);
        }
    }
}
