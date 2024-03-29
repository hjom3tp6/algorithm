package com.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode_15 {
  public List<List<Integer>> threeSum(int[] nums) {
    if (nums.length < 3) {
      return Collections.emptyList();
    }
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        if (nums[left] + nums[right] + nums[i] == 0) {
          res.add(Arrays.asList(nums[i], nums[left], nums[right]));
          do {
            left++;
          } while (left < nums.length && nums[left] == nums[left - 1]);

          do {
            right--;
          } while (right > i && nums[right] == nums[right + 1]);

        } else if (nums[left] + nums[right] + nums[i] > 0) {
          right--;
        } else {
          left++;
        }
      }
    }
    return res;
  }
}
