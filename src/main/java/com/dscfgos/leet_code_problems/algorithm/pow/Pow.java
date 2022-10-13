package com.dscfgos.leet_code_problems.algorithm.pow;

/**
 * (50) - Pow(x, n)
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
public class Pow {

    public double myPowFastPow(double x, int n) {

        if (n < 0) {
            x = 1 / x;
        }

        return fastPow(x, Math.abs(n));
    }

    public double myPowBinary(double x, int n) {

        if (n < 0) {
            x = 1 / x;
        }

        double result = 1;
        double curr_product = x;

        for (int i = Math.abs(n); i > 0 ; i/=2) {
            if(i % 2 == 1){
                result *= curr_product;
            }
            curr_product *= curr_product;
        }

        return result;
    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

}
