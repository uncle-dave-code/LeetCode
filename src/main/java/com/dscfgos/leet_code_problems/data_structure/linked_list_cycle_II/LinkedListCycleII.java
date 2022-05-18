package com.dscfgos.leet_code_problems.data_structure.linked_list_cycle_II;

import java.util.HashSet;
import java.util.Set;

/**
 * (142) - Linked List Cycle II
 * <p>
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list
 * that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if(head != null){
            Set<ListNode> setNodes = new HashSet<>();

            while(head != null){
                if(setNodes.contains(head)){
                    return head;
                }else{
                    setNodes.add(head);
                    head = head.next;
                }
            }
        }

        return null;
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