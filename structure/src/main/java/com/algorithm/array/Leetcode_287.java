package com.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * https://leetcode.com/problems/find-the-duplicate-number/solution/
 */
public class Leetcode_287 {

    public int findDulicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        tortoise = nums[0];
        while (tortoise!= hare) {
            hare = nums[hare];
            tortoise = nums[tortoise];
        }
        return hare;
    }

    public int findDuplicate_AHI(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];
    }

    // Array as HashMap (Recursion)
    public int findDuplicate_AHR(int[] nums) {
        return store(nums, 0);
    }

    public int store(int[] nums, int cur) {
        if (nums[cur] == cur) {
            return cur;
        }
        int next = nums[cur];
        nums[cur] = cur;
        return store(nums, next);
    }

    // Negative Marking
    public int findDuplicate_NegativeMarking(int[] nums) {
        int duplacate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplacate = cur;
                break;
            } else {
                nums[cur] *= -1;
            }
        }

        // Restore numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return duplacate;
    }

    // Set
    public int findDuplicate_Set(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    // Sort
    public int findDuplicate_sort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    // Brute-force
    public int findDuplicate_BruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
