HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.

On the first day, half of those  people (i.e., ) like the advertisement and each shares it with  of their friends. At the beginning of the second day,  people receive the advertisement.

Each day,  of the recipients like the advertisement and will share it with  friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .

Example
.

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24
The progression is shown above. The cumulative number of likes on the  day is .

Function Description

Complete the viralAdvertising function in the editor below.

viralAdvertising has the following parameter(s):

int n: the day number to report
Returns

int: the cumulative likes at that day
Input Format

A single integer, , the day number.

Constraints

Sample Input

3
Sample Output

9
Explanation

This example is depicted in the following diagram:

strange ad.png

 people liked the advertisement on the first day,  people liked the advertisement on the second day and  people liked the advertisement on the third day, so the answer is .
  
  OUTPUT :-
    
    // import java.io.*;
import java.util.*;

public class Solution {

    public static final int INITIAL_AMOUNT_OF_PEOPLE = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int currentAmount = INITIAL_AMOUNT_OF_PEOPLE;
            int totalNumber = 0;
            for (int i = 0; i < n; i++) {
                currentAmount = currentAmount/2;
                totalNumber += currentAmount;
                currentAmount *= 3;
            }
            System.out.println(totalNumber);
        }
    }
}

