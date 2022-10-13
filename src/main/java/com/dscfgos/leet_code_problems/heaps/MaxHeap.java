package com.dscfgos.leet_code_problems.heaps;

public class MaxHeap {

    private int[] maxHeap;
    private int heapSize;
    private int realSize = 0;

    public MaxHeap(int heapSize) {
        this.heapSize = heapSize;
        this.maxHeap = new int[heapSize + 1];
        this.maxHeap[0] = 0;
    }

    public void add(int element) {
        if (realSize == heapSize) {
            throw new RuntimeException("Heap is full");
        }
        realSize++;

        int currentIndex = realSize;

        maxHeap[currentIndex] = element;
        int parentIndex = currentIndex / 2;

        while (maxHeap[currentIndex] > maxHeap[parentIndex] && currentIndex > 1) {
            int temp = maxHeap[currentIndex];
            maxHeap[currentIndex] = maxHeap[parentIndex];
            maxHeap[parentIndex] = temp;
            currentIndex = parentIndex;
            parentIndex = currentIndex / 2;
        }
    }

    public int peek() {
        if (realSize == 0) {
            throw new RuntimeException("Heap is empty");
        }
        return maxHeap[1];
    }

    public int pop(){
        if (realSize == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int element = maxHeap[1];
        maxHeap[1] = maxHeap[realSize];
        realSize--;
        int currentIndex = 1;

        while(currentIndex <= realSize/2){
            int leftChildIndex = currentIndex * 2;
            int rightChildIndex = currentIndex * 2 + 1;

            if(maxHeap[currentIndex] < maxHeap[leftChildIndex] || maxHeap[currentIndex] < maxHeap[rightChildIndex]){
                if(maxHeap[leftChildIndex] > maxHeap[rightChildIndex]){
                    int temp = maxHeap[leftChildIndex];
                    maxHeap[leftChildIndex] = maxHeap[currentIndex];
                    maxHeap[currentIndex] = temp;
                    currentIndex = leftChildIndex;
                }else{
                    int temp = maxHeap[rightChildIndex];
                    maxHeap[rightChildIndex] = maxHeap[currentIndex];
                    maxHeap[currentIndex] = temp;
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
                sb.append(maxHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }


}
