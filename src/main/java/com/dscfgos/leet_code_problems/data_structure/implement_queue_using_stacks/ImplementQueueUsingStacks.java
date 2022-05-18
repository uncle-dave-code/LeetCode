package com.dscfgos.leet_code_problems.data_structure.implement_queue_using_stacks;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * (232) - Implement Queue using Stacks
 * <p>
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal
 * queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a stack, which means only push to top,
 * peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively.
 * You may simulate a stack using a list or deque (double-ended queue) as long
 * as you use only a stack's standard operations.
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> stack;
    private Stack<Integer> tmpStack;

    public ImplementQueueUsingStacks() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(!stack.isEmpty()){
          while (!stack.isEmpty()){
              tmpStack.push(stack.pop());
          }
        }
        stack.push(x);

        if(!tmpStack.isEmpty()){
            while (!tmpStack.isEmpty()){
                stack.push(tmpStack.pop());
            }
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
