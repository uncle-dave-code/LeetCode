package com.dscfgos.leet_code_problems.algorithm.remove_nth_node_from_end_list;

import com.dscfgos.leet_code_problems.algorithm.middle_linked_list.MiddleOfLinkedList;

/**
 * (19) - Remove Nth Node From End of List
 * <p>
 * Given the head of a linked list, remove the nth node
 * from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head;
        for (int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }

        if(currentNode == null){
            return head.next;
        }

        ListNode nodeBefore = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
            nodeBefore = nodeBefore.next;
        }

        nodeBefore.next = nodeBefore.next.next;

        return head;

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
}
