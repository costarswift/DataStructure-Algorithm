package com.xaut.Dec_11_2022;

import com.xaut.Library.ListNode;

public class Leetcode206 {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode preNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;//将右指针的下一个元素保存起来
            currNode.next = preNode;//将左指针指向的元素赋值给右指针指向的下一个元素
            preNode = currNode;//将左指针后移到右指针的位置

            currNode = nextNode;//把之前保存的节点赋值给右指针
        }
        return preNode;
    }
}
