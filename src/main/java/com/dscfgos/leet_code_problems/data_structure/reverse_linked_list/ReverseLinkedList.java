package com.dscfgos.leet_code_problems.data_structure.reverse_linked_list;

/**
 * (206) - Reverse Linked List
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentHead = head;

        while(head.next != null){
            ListNode pointer = head.next;
            head.next = pointer.next;
            pointer.next = currentHead;
            currentHead = pointer;
        }

        return currentHead;
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
