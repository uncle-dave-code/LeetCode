package com.dscfgos.leet_code_problems.data_structure.median_two_sorted_arrays;

/**
 * Median of Two Sorted Arrays
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        medianTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //swapping the arrays if nums1 is longer than nums2
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int totalLength = nums1.length + nums2.length;
        int start = 0;
        int end = nums1.length;

        while (start <= end) {
            int i = (start + end) / 2;
            int j = (totalLength + 1) / 2 - i;

            if (i > start && nums1[i - 1] > nums2[j]) {
                end = i - 1;
            } else if (i < end && nums2[j - 1] > nums1[i]) {
                start = i + 1;
            } else {
                int maxLeft = i == 0 ? nums2[j - 1] : (j == 0 ? nums1[i - 1] : Math.max(nums1[i - 1], nums2[j - 1]));

                if ((totalLength) % 2 == 1) {
                    return maxLeft;
                }
                int minRight = i == nums1.length ? nums2[j] : (j == nums2.length ? nums1[i] : Math.min(nums1[i], nums2[j]));
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;

    }
}
