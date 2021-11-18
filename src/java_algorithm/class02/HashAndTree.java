package java_algorithm.class02;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.HashMap;
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
        //set只有key，map既有key也有value
        //hashSet1的key是基础类型 -> int类型
        HashSet<Integer>hashSet1=new HashSet<>();
        hashSet1.add(3);
        System.out.println(hashSet1.contains(3));
        hashSet1.remove(3);
        System.out.println(hashSet1.contains(3));


        HashMap<Integer,String>mapTest=new HashMap<>();
        mapTest.put(1,"zuo");
        mapTest.put(2,"cheng");
        mapTest.put(2,"2");//key不能重复
        System.out.println(mapTest.containsKey(1));
        System.out.println(mapTest.get(1));
        System.out.println(mapTest.get(2));

        mapTest.remove(2);
        System.out.println(mapTest.get(2));
        System.out.println("===============================================");

        //hashSet2的key是非基础类型->Node类型

        nodeA=new Node(1);
        nodeB=new Node(1);
        HashSet<Node>hashSet2=new HashSet<>();
        

    }
}
