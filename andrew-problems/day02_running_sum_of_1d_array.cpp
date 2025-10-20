/*
 * LeetCode 1480: Running Sum of 1D Array
 * 
 * Problem: Given an array nums, return the running sum where runningSum[i] = sum(nums[0]...nums[i]).
 * Each element at index i is the sum of all elements from index 0 to i (inclusive).
 * 
 * Key concepts: array-traversal, prefix-sum, cumulative-sum
 * Time complexity: O(n)
 * Space complexity: O(n) for output array
 * 
 * Example: nums = [1,2,3,4] -> [1,3,6,10]
 * runningSum[0] = 1, runningSum[1] = 1+2 = 3, etc.
 */

#include <vector>
using namespace std;

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int x = 0;
        int y = 0;
        vector<int> new_nums(nums.size());
        new_nums[0] = nums[0];
        for (int i = 1; i < nums.size(); i++)
        {
            new_nums[i] = nums[i] + new_nums[i - 1];
        }
        return new_nums;
    }
};
