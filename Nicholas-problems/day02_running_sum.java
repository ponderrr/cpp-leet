/*
 * LeetCode 1480: Running Sum of 1d Array
 * 
 * Problem: Given an array nums, return the running sum of nums.
 * Running sum is calculated as: runningSum[i] = sum(nums[0]…nums[i])
 * 
 * Key concepts: array-manipulation, prefix-sum, cumulative-sum
 * Time complexity: O(n) where n is length of array
 * Space complexity: O(n) for the result array
 * 
 * Example: [1,2,3,4] -> [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
 * 14 mins
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int[] fill = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                if(i == 0){
                    fill[i] = nums[i];
                }
                else{
                    fill[i] = fill[i-1] + nums[i];
                }
            }
            return fill;
    }
}
