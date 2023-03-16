package com.xaut.Dec_11_2022;

import com.xaut.Library.ListNode;

public class Leetcode234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tem = reverseList(fast == null ? slow : slow.next);
        slow = head;
        ListNode temHead = tem;
        while(temHead != null){
            if(temHead.val != slow.val){
                return false;
            }
            temHead = temHead.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
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

    private ListNode frontPointer;

    public boolean isPalindrome2(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

}
