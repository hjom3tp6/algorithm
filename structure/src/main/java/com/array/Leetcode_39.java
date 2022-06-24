package com.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=irFtGMLbf-s&t=1122
 * https://leetcode.com/problems/combination-sum/submissions/
 */

public class Leetcode_39 {
    private LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(res, candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, int[] candidates, int target, int start) {
        if(target == 0) {
            res.add(new LinkedList<>(temp));
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                if(target < candidates[i]) {
                    break;
                }
                temp.add(candidates[i]);
                backtrack(res, candidates, target - candidates[i], i);
                temp.removeLast();
            }
        }
    }
    
}