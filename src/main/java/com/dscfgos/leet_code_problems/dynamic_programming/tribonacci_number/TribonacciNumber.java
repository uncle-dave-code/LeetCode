package com.dscfgos.leet_code_problems.dynamic_programming.tribonacci_number;

/**
 * (1137) N-th Tribonacci Number
 * <p>
 * The Tribonacci sequence Tn is defined as follows:
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * <p>
 * Given n, return the value of Tn.
 * <p>
 */
public class TribonacciNumber {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));

    }

    private static int tribonacci(int n) {
        if (n >= 0) {
            if (n == 0) {
                return 0;
            }
            if (n==1 || n==2){
                return 1;
            }

            int[] values = new int[n+1];
            values[0] = 0;
            values[1] = 1;
            values[2] = 1;

            for (int i = 3; i <= n; i++) {
                values[i] = values[i-1]+values[i-2]+values[i-3];
            }

            return values[n];

        }

        return 0;
    }
}
