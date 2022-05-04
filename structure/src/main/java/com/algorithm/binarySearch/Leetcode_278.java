package com.algorithm.binarySearch;

/**
 * https://github.com/doocs/leetcode/blob/v0.1.8/solution/0200-0299/0278.First%20Bad%20Version/README.md
 * https://leetcode.com/problems/first-bad-version/
 * 
 */
public class Leetcode_278 {
    /*
     * The isBadVersion API is defined in the parent class VersionControl.
     * boolean isBadVersion(int version);
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // just for test
    public static boolean isBadVersion(int version) {
        return true;
    }
}
