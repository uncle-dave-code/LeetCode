package com.dscfgos.leet_code_problems.data_structure.linked_list.odd_even_linked_list;

import java.util.HashSet;
import java.util.Set;

/**
 * Odd Even Linked List
 * <p>
 * Given the head of a singly linked list, group all the nodes with odd indices together
 * followed by the nodes with even indices, and return the reordered list.
 * <p>
 * The first node is considered odd, and the second node is even, and so on.
 * <p>
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * <p>
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while (even != null && even.next != null) {
                odd.next = even.next;
                even.next = odd.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }

        return head;
    }
}

class ListNode {
    private int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}