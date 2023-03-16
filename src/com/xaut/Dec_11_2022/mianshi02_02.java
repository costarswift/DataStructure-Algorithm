package com.xaut.Dec_11_2022;

import com.xaut.Library.ListNode;

public class mianshi02_02 {
    public static void main(String[] args) {

    }

    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        while(k > 1){
            fast = fast.next;
            k--;
        }

        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;

    }
}
