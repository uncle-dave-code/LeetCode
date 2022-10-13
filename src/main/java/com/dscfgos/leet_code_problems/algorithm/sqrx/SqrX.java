package com.dscfgos.leet_code_problems.algorithm.sqrx;

/**
 * (69) - Sqrt(x)
 * <p>
 * Given a non-negative integer x, compute and return the square root of x.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 * <p>
 * Note: You are not allowed to use any built-in exponent function or operator,
 * such as pow(x, 0.5) or x ** 0.5.
 */
public class SqrX {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
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
                return mid;
            }
        }

        return right;
    }


}
