package java_algorithm.class02;

import java.util.Comparator;
import java.util.HashSet;

public class HashAndTree {
    public static class Node{
        public int value;
        public Node next;
        public Node(int val){
            value=val;
        }
    }
    public static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.value-o2.value;
        }
    }

    public static void main(String[] args) {
        Node nodeA=null;
        Node nodeB=null;
        Node nodeC=null;

        HashSet<Integer>hashSet1=new HashSet<>();
        hashSet1.add(3);
        System.out.println(hashSet1.contains(3));
        hashSet1.remove(3);
        System.out.println(hashSet1.contains(3));
    }
}
