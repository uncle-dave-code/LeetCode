package com.dscfgos.leet_code_problems.data_structure.contains_duplicate.daily_challenge.stack_using_queues;

import java.util.*;

/**
 * (225) - Implement Stack using Queues
 * <p>
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front,
 * size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively.
 * You may simulate a queue using a list or deque (double-ended queue)
 * as long as you use only a queue's standard operations.
 */
public class StackUsingQueues {

    private List<Integer> queue = null;

    public StackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return (queue.size() > 0) ? queue.remove(queue.size() - 1) : -1;
    }

    public int top() {
        return (queue.size() > 0) ? queue.get(queue.size() - 1) : -1;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
