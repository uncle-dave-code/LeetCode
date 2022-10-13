package com.dscfgos.leet_code_problems.heaps;

import com.dscfgos.leet_code_problems.data_structure.contains_duplicate.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapsTest {
    @Test
    void minHeapTest() {

        MinHeap minHeap = new MinHeap(3);
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        assertAll(
                () -> assertEquals("[1,3,2]", minHeap.toString()),
                () -> assertEquals(1, minHeap.peek())
        );
    }

    @Test
    void maxHeapTest() {

        MaxHeap maxHeap = new MaxHeap(3);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);

        assertAll(
                () -> assertEquals("[3,1,2]", maxHeap.toString()),
                () -> assertEquals(3, maxHeap.peek())
        );
    }


}