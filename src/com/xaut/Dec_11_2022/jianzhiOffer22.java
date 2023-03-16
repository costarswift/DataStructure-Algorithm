package com.xaut.Dec_11_2022;

import com.xaut.Library.ListNode;

public class jianzhiOffer22 {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null) return null;

        ListNode fast = head;
        while(k > 1){
            if(fast == null) return null;
            fast = fast.next;
            k--;
        }

        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
