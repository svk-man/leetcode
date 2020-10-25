package main.com.leetcode.task.task0001;

public class Solution {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
     * to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        boolean isFound = false;
        for (int i = 0; !isFound && i < nums.length - 1; i++) {
            for (int j = i + 1; !isFound && j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    isFound = true;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
