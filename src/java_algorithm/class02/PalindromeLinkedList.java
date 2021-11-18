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
        Node right=head.next;//慢指针
        Node cur=head;//快指针
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
        if(head==null||head.next==null)return true;
        Node n1=head;//慢指针
        Node n2=head;//快指针
        while(n2.next!=null&&n2.next.next!=null){
            n1=n1.next;//一次走一步
            n2=n2.next.next;//一次走两步
        }
        n2=n1.next;
        n1.next=null;
        Node n3=null;
        while (n2!=null){//右半部分逆序
            n3=n2.next;
            n2.next=n1;
            n1=n2;
            n2=n3;
        }
        n3=n1;
        n2=head;
        boolean res=true;
        while (n1!=null&&n2!=null){
            if(n1.value!=n2.value){
                res=false;
                break;
            }
            n1=n1.next;//left to mid
            n2=n2.next;//right to mid
        }
        n1=n3.next;
        n3.next=null;
        while (n1!=null){
            n2=n1.next;
            n1.next=n3;
            n3=n1;
            n1=n2;
        }
        return true;
    }

}
