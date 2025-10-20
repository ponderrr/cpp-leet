/*
 * LeetCode 2678: Number of Senior Citizens
 * 
 * Problem: Given passenger details as 15-character strings, count passengers over 60 years old.
 * String format: [10 digits phone][1 char gender][2 digits age][2 digits seat]
 * 
 * Key concepts: string-parsing, character-conversion, age-calculation
 * Time complexity: O(n) where n is number of passengers
 * Space complexity: O(1)
 * 
 * Example: ["7868190130M7522","5303914400F9211","9273338290F4010"]
 * Ages are 75, 92, 40 -> 2 passengers over 60
 */

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String a = details[i];
            int x = (a.charAt(11) - '0') * 10 + (a.charAt(12) - '0');
            if (x > 60) {
                count++;
            }
        }
        return count;
    }
}

