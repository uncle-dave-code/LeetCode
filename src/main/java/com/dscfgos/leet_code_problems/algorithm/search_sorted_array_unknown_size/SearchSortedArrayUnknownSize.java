package com.dscfgos.leet_code_problems.algorithm.search_sorted_array_unknown_size;

/**
 * (702) - Search in a Sorted Array of Unknown Size
 * <p>
 * This is an interactive problem.
 * <p>
 * You have a sorted array of unique elements and an unknown size.
 * You do not have an access to the array but you can use the ArrayReader interface to access it.
 * You can call ArrayReader.get(i) that:
 * <p>
 * returns the value at the ith index (0-indexed) of the secret array (i.e., secret[i]), or
 * returns 231 - 1 if the i is out of the boundary of the array.
 * You are also given an integer target.
 * <p>
 * Return the index k of the hidden array where secret[k] == target or return -1 otherwise.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchSortedArrayUnknownSize {
    public int search(ArrayReader reader, int target) {
        if(reader.get(0)==target){
            return 0;
        }

        int left = 0; int right = 1;
        while (reader.get(right)< target){
            left = right;
            right <<= 1;
        }

        while(left<= right){
            int mid = left + (right-left)/2;
            int num = reader.get(mid);
            if(num==target){
                return mid;
            }

            if(num > target){
                right = mid-1;
            }

            if(num < target){
                left =mid +1;
            }

        }

        return -1;
    }
}

interface ArrayReader {
     public int get(int index);
}
