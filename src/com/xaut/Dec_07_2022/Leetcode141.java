package com.xaut.Dec_07_2022;

import com.xaut.Library.ListNode;

public class Leetcode141 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
