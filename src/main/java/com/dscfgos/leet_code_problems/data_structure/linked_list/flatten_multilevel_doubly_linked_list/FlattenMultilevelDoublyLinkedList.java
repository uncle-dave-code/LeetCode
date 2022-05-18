package com.dscfgos.leet_code_problems.data_structure.linked_list.flatten_multilevel_doubly_linked_list;

/**
 * (430) - Flatten a Multilevel Doubly Linked List
 * <p>
 * You are given a doubly linked list, which contains nodes that have a next pointer,
 * a previous pointer, and an additional child pointer. This child pointer may or may not
 * point to a separate doubly linked list, also containing these special nodes.
 * These child lists may have one or more children of their own, and so on,
 * to produce a multilevel data structure as shown in the example below.
 *
 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level,
 * doubly linked list. Let curr be a node with a child list.
 * The nodes in the child list should appear after curr and before curr.next in the flattened list.
 *
 * Return the head of the flattened list.
 * The nodes in the list must have all of their child pointers set to null.
 */
public class FlattenMultilevelDoublyLinkedList {

    public Node flatten(Node head) {
        if(head != null){
            Node tmpHead = new Node(0,null,head,null);

            doFlatten(tmpHead, head);

            tmpHead.next.prev = null;

            head = tmpHead.next;
        }
        return head;
    }

    private Node doFlatten(Node prev, Node current) {
        if(current == null){
            return prev;
        }

        current.prev = prev;
        prev.next = current;

        Node tmpNext = current.next;

        Node tailNode = doFlatten(current, current.child);
        current.child = null;

        return doFlatten(tailNode, tmpNext);
    }
}

class Node {
    private int val;
    Node next;
    Node prev;
    Node child;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    public Node(int val,Node prev,Node next,Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
}