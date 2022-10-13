package com.dscfgos.leet_code_problems.data_structure.last_stone_weight;

import java.util.Arrays;

/**
 * (1046) - Last Stone Weight
 * <p>
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * <p>
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
 * Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 * <p>
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 * <p>
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        stones = buildHeap(stones);
        while (stones.length > 1) {
            int x = stones[0];
            int y = stones[1];
            if (x == y) {
                stones = Arrays.copyOfRange(stones, 2, stones.length);
            } else {
                stones[0] = x - y;
                stones[1] = stones[stones.length - 1];
                stones = Arrays.copyOf(stones, stones.length - 1);
            }
            stones = buildHeap(stones);
        }
        return stones.length == 0 ? 0 : stones[0];
    }

    private void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }


    private int[] buildHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            maxHeapify(nums, i);
        }
        return nums;
    }

    private int[] maxHeapify(int[] nums, int pos) {
        int left = this.getLeft(nums, pos);
        int right = this.getRight(nums, pos);

        if (left < nums.length && nums[left] > nums[pos]) {
            swap(nums, left, pos);
            maxHeapify(nums, left);
        }
        if (right < nums.length && nums[right] > nums[pos]) {
            swap(nums, right, pos);
            maxHeapify(nums, right);
        }

        return nums;
    }

    private int getLeft(int[] nums, int pos) {
        return 2 * pos + 1;
    }

    private int getRight(int[] nums, int pos) {
        return 2 * pos + 2;
    }
}
