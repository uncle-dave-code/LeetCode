package com.dscfgos.leet_code_problems.data_structure.linked_list.copy_list_with_random_pointer;

/**
 * (138) - Copy List with Random Pointer
 * <p>
 * A linked list of length n is given such that each node contains an additional random pointer,
 * which could point to any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes,
 * where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y,
 * then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 * <p>
 * The linked list is represented in the input/output as a list of n nodes.
 * Each node is represented as a pair of [val, random_index] where:
 * <p>
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to,
 * or null if it does not point to any node.
 * Your code will only be given the head of the original linked list.
 */
public class CopyListRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node pointer = head;
        while (pointer != null) {

            //Clone node
            Node cloned = new Node(pointer.val);
            cloned.next = pointer.next;
            pointer.next = cloned;
            pointer = cloned.next;
            //A list like A -> A' -> B-> B'
        }

        pointer = head;
        while (pointer != null) {
            //Copy random references
            pointer.next.random = (pointer.random != null) ? pointer.random.next : null;
            pointer = pointer.next.next;
        }

        //Now separate the two list
        Node original = head;
        Node cloned = head.next;
        Node result = head.next;

        while (original != null) {
            original.next = original.next.next;
            cloned.next = (cloned.next != null) ? cloned.next.next : null;

            original = original.next;
            cloned = cloned.next;
        }

        return result;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}