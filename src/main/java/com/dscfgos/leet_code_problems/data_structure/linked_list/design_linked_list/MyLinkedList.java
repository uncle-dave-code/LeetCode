package com.dscfgos.leet_code_problems.data_structure.linked_list.design_linked_list;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (707) - Design Linked List
 * <p>
 * Design your implementation of the linked list.
 * You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes:
 * val and next. val is the value of the current node,
 * and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list,
 * you will need one more attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 */
public class MyLinkedList {

    private ListNode head;

    public MyLinkedList() {

    }

    public int get(int index) {
        ListNode node = this.getNode(index);
        if (node != null) {
            return node.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        } else {
            ListNode tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if (index >= 0) {
            if (index == 0) {
                this.addAtHead(val);
            } else {
                ListNode preNode = this.getNode(index - 1);
                if (preNode != null) {
                    ListNode tmp = preNode.next;
                    preNode.next = node;
                    node.next = tmp;
                }
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head != null) {
            if (index == 0) {
                head = head.next;
            } else {
                ListNode prevNode = getNode(index - 1);
                if (prevNode != null) {
                    ListNode next = (prevNode.next != null && prevNode.next.next != null) ? prevNode.next.next : null;
                    prevNode.next = next;
                }
            }
        }

    }

    private ListNode getNode(int index) {
        ListNode result = null;
        if (head != null && index >= 0) {
            int counter = 0;
            result = head;
            while (result != null && counter <= index) {
                if (index == counter) {
                    return result;
                }

                result = result.next;
                counter++;
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
