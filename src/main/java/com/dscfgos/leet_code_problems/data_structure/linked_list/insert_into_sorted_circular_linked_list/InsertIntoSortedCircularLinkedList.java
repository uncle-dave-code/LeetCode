package com.dscfgos.leet_code_problems.data_structure.linked_list.insert_into_sorted_circular_linked_list;

public class InsertIntoSortedCircularLinkedList {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node newNode = new Node(insertVal, null);
            newNode.next = newNode;
            return newNode;
        }

        Node pointer = head;
        boolean toInsert = false;

        do {
            if (pointer.val <= insertVal && insertVal <= pointer.next.val) {
                // Case 1).
                toInsert = true;
            } else if (pointer.val > pointer.next.val) {
                // Case 2).
                if (insertVal >= pointer.val || insertVal <= pointer.next.val)
                    toInsert = true;
            }

            if (toInsert) {
                pointer.next = new Node(insertVal, pointer.next);
                return head;
            }

            pointer = pointer.next;
        } while (pointer != head);

        // Case 3).
        pointer.next = new Node(insertVal, pointer.next);
        return head;
    }
}

class Node {
    public int val;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
