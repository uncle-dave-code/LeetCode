package com.dscfgos.leet_code_problems.data_structure.linked_list.add_two_numbers;

/**
 * (2) - Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        return getSum(l1, l2, 0);
    }

    private ListNode getSum(ListNode l1, ListNode l2, int carry) {

        ListNode result = null;
        if (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int val = val1 + val2 + carry;

            if (val >= 10) {
                result = new ListNode(val - 10);
                result.next = getSum((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, 1);
            } else {
                result = new ListNode(val);
                result.next = getSum((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, 0);
            }
        }
        return result;
    }

}

class ListNode {
    public ListNode(int val) {
        this.val = val;
    }

    public int val;
    public ListNode next;

}
