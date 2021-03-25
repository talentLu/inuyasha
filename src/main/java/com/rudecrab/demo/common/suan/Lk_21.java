package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/25 10:09
 **/
public class Lk_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode currentNode = root;
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        while (true) {
            if (l1 == null && l2 == null) {
                return root.next;
            } else if (l1 != null && l2 == null) {
                ListNode listNode = new ListNode(l1.val);
                currentNode.next = listNode;
                currentNode = listNode;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                ListNode listNode = new ListNode(l2.val);
                currentNode.next = listNode;
                currentNode = listNode;
                l2 = l2.next;
            } else if (l1.val <= l2.val) {
                ListNode listNode = new ListNode(l1.val);
                currentNode.next = listNode;
                currentNode = listNode;
                l1 = l1.next;
            } else {
                ListNode listNode = new ListNode(l2.val);
                currentNode.next = listNode;
                currentNode = listNode;
                l2 = l2.next;
            }
        }
    }

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode currentNode = root;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = l1 == null ? l2 : l1;
        return root.next;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode listNode = mergeTwoLists2(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



