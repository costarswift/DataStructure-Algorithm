package com.xaut.Dec_07_2022;
import com.xaut.Library.ListNode;

public class Leetcode83 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(4,null)));

        deleteDuplicates(listNode);
        deleteDuplicates2(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tem = head;
        while(tem != null && tem.next != null){
            if(tem.val == tem.next.val){
                tem.next = tem.next.next;
            }else{
                tem = tem.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        if(head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);

        return head.val == head.next.val ? head.next : head;
    }
}
