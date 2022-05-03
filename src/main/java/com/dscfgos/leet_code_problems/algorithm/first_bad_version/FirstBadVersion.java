package com.dscfgos.leet_code_problems.algorithm.first_bad_version;

/**
 * (278) - First Bad Version
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
    public int firstBadVersion(int badVersion, int version) {
        return this.firstBadVersion(badVersion, 1, version);
    }

    private int firstBadVersion(int badVersion, int low, int high) {
        int mid = low + (high - low) / 2;
        if (mid == low) {
            return isBadVersion(badVersion, low) ? low : high;
        } else if (isBadVersion(badVersion, mid)) {
            return firstBadVersion(badVersion, low, mid);
        } else {
            return firstBadVersion(badVersion, mid, high);
        }
    }


    boolean isBadVersion(int badVersion, int version) {
        return badVersion <= version;
    }
}
