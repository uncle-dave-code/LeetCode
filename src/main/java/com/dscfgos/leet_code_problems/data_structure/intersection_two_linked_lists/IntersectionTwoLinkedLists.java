package com.dscfgos.leet_code_problems.data_structure.intersection_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

/**
 * (160) - Intersection of Two Linked Lists
 * <p>
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 */
public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null && headB != null) {
            Set<ListNode> setNodes = new HashSet<>();

            while (headA != null || headB != null) {
                if (headA != null) {
                    if (setNodes.contains(headA)) {
                        return headA;
                    } else {
                        setNodes.add(headA);
                        headA = headA.next;
                    }
                }

                if (headB != null) {
                    if (setNodes.contains(headB)) {
                        return headB;
                    } else {
                        setNodes.add(headB);
                        headB = headB.next;
                    }
                }
            }
        }
        return null;
    }
}

class ListNode {
    public ListNode(int val) {
        this.val = val;
    }

    public int val;
    public ListNode next;

}
