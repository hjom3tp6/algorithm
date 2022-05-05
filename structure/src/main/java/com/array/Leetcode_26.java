package com.array;

import java.util.Arrays;

public class Leetcode_26 {

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     * https://github.com/doocs/leetcode/blob/v0.1.8/solution/0000-0099/0026.Remove%20Duplicates%20from%20Sorted%20Array/README.md
     */
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int i = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("i => " + i);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (j == 0 || nums[i] != nums[j - 1]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }

    public static int removeDuplicates_2(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 1 || num != nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
