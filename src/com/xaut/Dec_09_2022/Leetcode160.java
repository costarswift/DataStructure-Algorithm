package com.xaut.Dec_09_2022;

import com.xaut.Library.ListNode;

public class Leetcode160 {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode A_pri = headA;
        ListNode B_pri = headB;

        while(A_pri != B_pri){
            A_pri = A_pri == null ? headB : A_pri.next;
            B_pri = B_pri == null ? headA : B_pri.next;
        }

        return A_pri;

    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        int step = getLength(headA) - getLength(headB);
        ListNode A_pri = headA;
        ListNode B_pri = headB;
        if(step > 0){
            while (step > 0) {
                A_pri = A_pri.next;
                step--;
            }
        }

        if(step < 0){
            while (step < 0) {
                B_pri = B_pri.next;
                step++;
            }
        }

        while (B_pri != A_pri){
            A_pri = A_pri.next;
            B_pri = B_pri.next;
        }
        return A_pri;
    }

    private static int getLength(ListNode head){
        if(head == null) return 0;

        int i = 1;
        ListNode listNode = head;
        while (listNode.next != null){
            i++;
            listNode = listNode.next;
        }
        return i;
    }
}
