An integer  is a divisor of an integer  if the remainder of .

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example

Check whether ,  and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether , , and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether  and  are divisors of .  is, but  is not. Return .

Function Description

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

int n: the value to analyze
Returns

int: the number of digits in  that are divisors of 
Input Format

The first line is an integer, , the number of test cases.
The  subsequent lines each contain an integer, .

Constraints



Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number  is broken into two digits,  and . When  is divided by either of those two digits, the remainder is  so they are both divisors.

The number  is broken into four digits, , , , and .  is evenly divisible by its digits , , and , but it is not divisible by  as division by zero is undefined.
  
  OUTPUT :-
    
    import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int b[]=new int[a];
        for(int i=0; i<a; i++){
            b[i]=sc.nextInt();
        }
        
        for(int i=0; i<a; i++){
            String str = Integer.toString(b[i]);
            
            for(int j=0;j<str.length();j++){
                char p = str.charAt(j);
                int foo = Integer.parseInt(String.valueOf(p));
                if(foo != 0){
                if(b[i]%foo == 0){
                    // System.out.print("b[i] = " + b[i]);
                    // System.out.println(" foo = " + foo);
                    
                    count++;
                }
                if(str.length()-1 == j){
                    System.out.println(count);
                    count =0;
                }
                }
        }
        }
    }
}
