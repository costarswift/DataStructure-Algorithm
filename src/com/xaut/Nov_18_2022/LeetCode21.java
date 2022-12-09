package com.xaut.Nov_18_2022;


import com.xaut.Library.ListNode;

public class LeetCode21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));

        ListNode res1 = Method1(l1, l2);
        ListNode res2 = Method2(l1, l2);
    }

    private static ListNode Method1(ListNode list1, ListNode list2){
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode preHead = new ListNode();
        ListNode head = preHead;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if(list1 != null) head.next = list1;
        if(list2 != null) head.next = list2;

        return preHead.next;
    }

    private static ListNode Method2(ListNode list1, ListNode list2){
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if(list1.val <= list2.val){
            list1.next = Method2(list1.next, list2);
            return list1;
        }else{
            list2.next = Method2(list1,list2.next);
            return list2;
        }
    }
}
