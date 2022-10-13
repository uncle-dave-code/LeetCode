package com.dscfgos.leet_code_problems.algorithm.valid_perfect_square;

/**
 * (367) - Valid Perfect Square
 * <p>
 * Given a positive integer num, write a function which
 * returns True if num is a perfect square else False.
 * <p>
 * Follow up: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {
    public boolean mySqrt(int x) {
        if (x < 1) {
            return false;
        }
        if (x == 1) {
            return true;
        }
        long num;
        int mid, left = 2, right = x / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            num = (long) mid * mid;
            if (num > x) {
                right = mid - 1;
            } else if (num < x) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }


}
