package java_algorithm.class02;

import java.util.Stack;

/**
 * 判断一个列表是否为回文结构
 * 给定一个单链表的头结点head，请判断该链表是否为回文结构。
 * 例子 1->2->1,返回true；1->2->2->1,返回true；15->6->15,返回true；
 * 1->2->3,返回false。
 *要求：如果链表长度为N，时间复杂度达到O（N），额外空间复杂度达到O（1）
 *
 */
public class PalindromeLinkedList {

    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value=data;
        }
    }

    //need n extra space
    public static boolean isPalindrome1(Node head){
        Stack<Node>stack=new Stack<Node>();
        Node cur=head;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while(head!=null){
            if(head.value!=stack.pop().value)return false;
            head=head.next;

        }
        return true;
    }
    //need n/2 extra space
    public static boolean isPalindrome2(Node head){
        if(head==null||head.next==null)return true;
        Node right=head.next;
        Node cur=head;
        while(cur.next!=null&&cur.next.next!=null){
            right=right.next;
            cur=cur.next.next;
        }
        Stack<Node>stack=new Stack<Node>();
        while (right!=null){
            stack.push(right);
            right=right.next;
        }
        while (!stack.isEmpty()){
            if (head.value!=stack.pop().value)return false;
            head=head.next;
        }
        return true;
    }
    //need O(1) extra space
    public static boolean isPalindrome3(Node head){
        if(head==null||head.next==null)return false;

        return true;
    }

}
