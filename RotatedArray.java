Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
Accepted
1.5M
Submissions
3.7M
Acceptance Rate
39.4%
Seen this question in a real interview before?
1/4
Yes
No
Discussion (126)
Similar Questions
Related Topics

OUTPUT :-
  class Solution {

    void Rev(int nums[],int start, int end ){
        // start = 0;
        // end = nums.length-1;
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            ++start;
            --end;
        }
    }
    public void rotate(int nums[], int k) {
        // k = 3
       k = k % nums.length;
    //    Reverse the array
       Rev(nums, 0,nums.length-1);

    //    5  4  3
       Rev(nums, 0, k-1);
      
    //  1  2
       Rev(nums, k, nums.length-1);


              
    
    }
}
