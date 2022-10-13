package com.dscfgos.leet_code_problems.heaps;

public class MinHeap {

    private int[] minHeap;
    private int heapSize;
    private int realSize = 0;

    public MinHeap(int heapSize) {
        this.heapSize = heapSize;
        this.minHeap = new int[heapSize + 1];
        this.minHeap[0] = 0;
    }

    public void add(int element) {
        if (realSize == heapSize) {
            throw new RuntimeException("Heap is full");
        }
        realSize++;

        int currentIndex = realSize;

        minHeap[currentIndex] = element;
        int parentIndex = currentIndex / 2;

        while (minHeap[currentIndex] < minHeap[parentIndex] && currentIndex > 1) {
            int temp = minHeap[currentIndex];
            minHeap[currentIndex] = minHeap[parentIndex];
            minHeap[parentIndex] = temp;
            currentIndex = parentIndex;
            parentIndex = currentIndex / 2;
        }
    }

    public int peek() {
        if (realSize == 0) {
            throw new RuntimeException("Heap is empty");
        }
        return minHeap[1];
    }

    public int pop(){
        if (realSize == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int element = minHeap[1];
        minHeap[1] = minHeap[realSize];
        realSize--;
        int currentIndex = 1;

        while(currentIndex <= realSize/2){
            int leftChildIndex = currentIndex * 2;
            int rightChildIndex = currentIndex * 2 + 1;

            if(minHeap[currentIndex] > minHeap[leftChildIndex] || minHeap[currentIndex] > minHeap[rightChildIndex]){
                if(minHeap[leftChildIndex] < minHeap[rightChildIndex]){
                    int temp = minHeap[leftChildIndex];
                    minHeap[leftChildIndex] = minHeap[currentIndex];
                    minHeap[currentIndex] = temp;
                    currentIndex = leftChildIndex;
                }else{
                    int temp = minHeap[rightChildIndex];
                    minHeap[rightChildIndex] = minHeap[currentIndex];
                    minHeap[currentIndex] = temp;
                    currentIndex = rightChildIndex;
                }
            }else{
                break;
            }
        }
        return element;
    }

    public int size() {
        return realSize;
    }

    public String toString() {
        if (realSize == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSize; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }


}
