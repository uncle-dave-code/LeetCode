package com.dscfgos.leet_code_problems.daily_challenge;

import com.dscfgos.leet_code_problems.daily_challenge.max_number_k_sum_pairs.MaxNumberKSumPairs;
import com.dscfgos.leet_code_problems.data_structure.two_sum.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyChallengeTest {

    @Test
    void maxOperations() {
        MaxNumberKSumPairs maxNumberKSumPairs = new MaxNumberKSumPairs();
        assertAll(
//                () -> assertEquals(2, maxNumberKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5)),
//                () -> assertEquals(1, maxNumberKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6)),
                () -> assertEquals(4, maxNumberKSumPairs.maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3))
        );
    }

}