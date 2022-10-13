package com.dscfgos.leet_code_problems.data_structure.delete_node;


public class DeleteNode {

    public void deleteNode(ListNode node) {

    if (node == null) {
            return;
        }

        if (node.next == null) {
            return;
        }

        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
                break;
            }
            node = node.next;
        }
    }
}

class ListNode {
    public ListNode(int val) {
        this.val = val;
    }

    public int val;
    public ListNode next;

}
