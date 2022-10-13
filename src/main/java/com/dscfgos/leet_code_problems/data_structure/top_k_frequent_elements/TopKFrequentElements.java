package com.dscfgos.leet_code_problems.data_structure.top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * (347) - Top K Frequent Elements
 * <p>
 * Given an integer array nums and an integer k,
 * return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //Queue comparator is the comparator of the element in the queue,
        // so the element with the highest frequency will be the first element in the queue.
        Queue<Integer> queue = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

        for (int key : map.keySet()) {
            queue.offer(key);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int result[] = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        return result;
    }
}