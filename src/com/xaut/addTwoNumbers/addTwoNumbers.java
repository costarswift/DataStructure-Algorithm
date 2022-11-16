package com.xaut.addTwoNumbers;

public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode listNode = addTwoNumbers(l1, l2);


    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int L1_value = value (l1);
        int L2_value = value (l2);
        int res = L1_value + L2_value;
        //将res生成为链表
        return toListNode(res);

    }
    //设计一个方法求链表表示的数值
    private static int value(ListNode l){
        int i = 0;
        int res = 0;
        while (l.next != null){
            res += l.val * (int)Math.pow(10,i);
            l = l.next;
            i++;
        }
        return res += l.val * (int)Math.pow(10,i);
    }
    //设计一个将数字转换为链表的方法
    private static ListNode toListNode(int res){
        if (res == 0){
            return new ListNode(0);
        }
        int i = 0;
        ListNode root = new ListNode(res / (int)Math.pow(10,i) % 10,null);
        ListNode other = root;
        while(true){
            i += 1;
            if (res / (int)Math.pow(10,i) == 0) break;
            ListNode temp = new ListNode(res / (int)Math.pow(10,i) % 10,null);
            other.next = temp;
            other = other.next;
        }
        return root;
    }
}
