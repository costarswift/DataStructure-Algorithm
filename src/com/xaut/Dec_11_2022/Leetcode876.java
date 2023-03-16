package com.xaut.Dec_11_2022;

import com.xaut.Library.ListNode;

public class Leetcode876 {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
