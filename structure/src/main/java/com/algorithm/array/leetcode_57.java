package com.algorithm.array;

import java.util.LinkedList;
import java.util.List;

public class leetcode_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new LinkedList<>();
        int i = 0;

        // add all the intervals ending before newInterval starts
        while (i < intervals.length &&  newInterval[0] > intervals[i][1]) {
            result.add(intervals[i]);
            i++;
        }

        // merge all overlapping intervals to one considering newInterval starts
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            // we could mutate newInterval here also
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // add the union of intervals we got
        result.add(newInterval);

        // add the the rest
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);

    }
}
