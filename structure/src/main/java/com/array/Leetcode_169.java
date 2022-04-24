package com.array;

import java.util.HashMap;
import java.util.Map;


public class Leetcode_169 {

  /**
   * https://ithelp.ithome.com.tw/articles/10213285
   * https://leetcode.com/problems/majority-element/
   * Boyer-Moore Voting Algorithm
   */

  public static void main(String[] args) {
    int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
    int i = majorityElement_HashMap(nums); // 2
    // System.out.println(i);
  }

  // Boyer-Boore Voting
  public static int majorityElement(int nums[]) {
    int count = 0;
    int majority = nums[0];
    for (int num : nums) {
      if (count == 0) {
        majority = num;
        count = 1;
      } else {
        count += (majority == num ? 1 : -1);
      }
    }
    return majority;
  }

  // Brute Force
  public static int majorityElement_BroutForce(int[] nums) {
    int majorityCount = nums.length / 2;
    for (int num : nums) {
      int count = 0;
      for (int elem : nums) {
        if (num == elem) {
          count++;
        }
      }
      if (count > majorityCount) {
        return num;
      }
    }
    return -1;
  }

  // HashMap
  public static int majorityElement_HashMap(int[] nums) {
    Map<Integer, Integer> counts = countNums(nums);
    Map.Entry<Integer, Integer> majorityEntry = null;
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
      System.out.print(entry.getValue() + " ");
      if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
        majorityEntry = entry;
      }
    }

    return majorityEntry.getKey();
  }

  private static Map<Integer, Integer> countNums(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    for (int num : nums) {
      if (counts.containsKey(num)) {
        counts.put(num, counts.get(num) + 1);
      } else {
        counts.put(num, 1);
      }
    }
    return counts;
  }
}
