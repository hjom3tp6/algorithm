package com.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_229 {
  /**
   * https://ithelp.ithome.com.tw/articles/10213286
   * https://leetcode.com/problems/majority-element-ii/
   * @return 
   */
  public static List<Integer> majorityElement(int[] nums) {
    int num1 = 0, count1 = 0, num2 = 1, count2 = 0;
    for (int num: nums) {
      if (num == num1) {
        ++count1;
      } else if (num == num2) {
        ++count2;
      } else if (count1 == 0)  {
        num1 = num;
        count1= 1;
      } else if (count2 == 0) {
        num2 = num;
        count2 = 1;
      } else {
        --count1;
        --count2;
      }
    }

    count1 = 0;
    count2 = 0;

    int required = nums.length / 3;

    for (int num : nums ) {
      if ( num == num1) {
        ++count1;
      } else if ( num == num2) {
        ++count2;
      }
    }

    List<Integer> result = new ArrayList<Integer>();
    if ( count1 > required ) {
      result.add(num1);
    }
    if ( count2 > required ) {
      result.add(num2);
    }
    return result;
  }
}
