package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_217 {

    public boolean containsDuplicate_hash(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public boolean containsDuplicate_sort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
