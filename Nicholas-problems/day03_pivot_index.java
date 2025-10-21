/*
 * LeetCode 724: Find Pivot Index
 * 
 * Problem: Given an array of integers nums, return the leftmost pivot index.
 * Pivot index is where the sum of all numbers to the left equals the sum of all numbers to the right.
 * If no such index exists, return -1.
 * 
 * Key concepts: array-traversal, prefix-sum, two-pointer-technique
 * Time complexity: O(n) where n is length of array
 * Space complexity: O(1)
 * 
 * Example: [1,7,3,6,5,6] -> 3
 * Explanation: Left sum = 1+7+3 = 11, Right sum = 5+6 = 11
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightsum = total - leftsum - nums[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum += nums[i];


        }
        return -1;
    }
}
