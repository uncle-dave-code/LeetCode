package com.dscfgos.leet_code_problems.data_structures_and_algorithms.arrays_strings;

/**
 * (1732) Find the Highest Altitude
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
 * i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 * <p>
 */
public class FindHighestAltitude {

    public static void main(String[] args) {
        var findHighestAltitude = new FindHighestAltitude();
        System.out.println(findHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    public int largestAltitude(int[] gain) {
        int lastAltitude = gain[0];
        int result = Math.max(lastAltitude, 0);
        for (int i = 1; i < gain.length; i++) {
            lastAltitude += gain[i];
            result = Math.max(lastAltitude, result);
        }

        return result;
    }
}
