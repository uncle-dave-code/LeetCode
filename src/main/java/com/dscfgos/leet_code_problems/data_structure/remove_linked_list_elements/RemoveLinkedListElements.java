package com.dscfgos.leet_code_problems.data_structure.remove_linked_list_elements;

/**
 * (203) - Remove Linked List Elements
 * <p>
 * Given the head of a linked list and an integer val, remove all the nodes
 * of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode baseNode = new ListNode(0);
        baseNode.next = head;

        ListNode previous = baseNode;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return baseNode.next;
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
