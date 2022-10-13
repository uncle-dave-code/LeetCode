package com.dscfgos.leet_code_problems.algorithm.reverse_integer;

/**
 * (7) - Reverse Integer
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {
    public int reverse(int x) {

        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }
            result = result * 10 + remainder;
        }
        return result;
    }
}
