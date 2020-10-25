package test.com.leetcode.task.task0001;

import main.com.leetcode.task.task0001.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum1() {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        int target = 9;

        int[] expectedNums = new int[2];
        expectedNums[0] = 0;
        expectedNums[1] = 1;

        Assertions.assertArrayEquals(expectedNums, Solution.twoSum(nums, target));
    }

    @Test
    void twoSum2() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;

        int target = 6;

        int[] expectedNums = new int[2];
        expectedNums[0] = 1;
        expectedNums[1] = 2;

        Assertions.assertArrayEquals(expectedNums, Solution.twoSum(nums, target));
    }

    @Test
    void twoSum3() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 3;

        int target = 6;

        int[] expectedNums = new int[2];
        expectedNums[0] = 0;
        expectedNums[1] = 1;

        Assertions.assertArrayEquals(expectedNums, Solution.twoSum(nums, target));
    }

    @Test
    void twoSum4() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;

        int target = 6;

        int[] expectedNums = new int[2];
        expectedNums[0] = 0;
        expectedNums[1] = 2;

        Assertions.assertArrayEquals(expectedNums, Solution.twoSum(nums, target));
    }
}