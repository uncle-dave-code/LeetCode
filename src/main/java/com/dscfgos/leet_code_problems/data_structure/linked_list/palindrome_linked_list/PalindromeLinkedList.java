package com.dscfgos.leet_code_problems.data_structure.linked_list.palindrome_linked_list;

/**
 * (234) - Palindrome Linked List
 * <p>
 * Given the head of a singly linked list, return true if it is a palindrome.
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode halfNode = getMiddleOfList(head);
        ListNode reversed = reverseList(halfNode.next);

        ListNode pointer1 = head;
        ListNode pointer2 = halfNode;
        boolean result = true;
        while (result && pointer2!=null){
            if(pointer1.val != pointer2.val ){
                result = false;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        halfNode.next = reverseList(reversed);

        return result;
    }

    private ListNode reverseList(ListNode head) {

        ListNode current = head;

        if (head != null && head.next != null) {
            while (head.next != null) {
                ListNode pointer = head.next;
                head.next = pointer.next;
                pointer.next = current;
                current = pointer;
            }
        }

        return current;
    }

    private ListNode getMiddleOfList(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;

        if (node != null) {
            while (fast.next != null && node.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }
}

class ListNode {
    int val;
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