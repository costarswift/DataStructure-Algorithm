package com.xaut.removeNthFromEnd;


public class removeNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode =
                new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));

        removeNthFromEnd(listNode,2);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1,head);

        ListNode slow = pre;
        ListNode fast = pre;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while (true){
            if (fast.next == null){
                slow.next = slow.next.next;
                return pre.next;
            }
            fast = fast.next;
            slow = slow.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}