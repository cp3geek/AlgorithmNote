package java_algorithm.class02;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

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
        //哈希表是无序的
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
        hashSet2.add(nodeA);
        System.out.println(hashSet2.contains(nodeA));
        System.out.println(hashSet2.contains(nodeB));
        hashSet2.remove(nodeA);
        System.out.println(hashSet2.contains(nodeA));
        System.out.println("===============================================");



//展示有序表常用操作
        TreeMap<Integer,String>treeMap1=new TreeMap<>();
        treeMap1.put(7,"我是7");
        treeMap1.put(5,"我是5");
        treeMap1.put(4,"我是4");
        treeMap1.put(3,"我是3");
        treeMap1.put(9,"我是9");
        treeMap1.put(2,"我是2");
        System.out.println(treeMap1.containsKey(5));
        System.out.println(treeMap1.get(5));
        System.out.println(treeMap1.firstKey()+",我最小");
        System.out.println(treeMap1.lastKey()+",我最大");
        System.out.println(treeMap1.floorKey(8)+",在表中所有小于等于8的数，我离8最近");
        System.out.println(treeMap1.ceilingKey(8)+",在表中所有大于等于8的数，我离8最近");
        System.out.println(treeMap1.floorKey(7)+",在表中所有小于等于7的数，我离7最近");
        System.out.println(treeMap1.ceilingKey(7)+",在表中所有大于等于7的数，我离7最近");
        treeMap1.remove(5);
        System.out.println(treeMap1.get(5)+",删了就没有了");
        System.out.println("========================================");


        TreeSet<Node>treeSet1=new TreeSet<>();//以下代码会报错，因为没有提供Node类型的比较器
        try{
            treeSet1.add(nodeA);
            treeSet1.add(nodeB);
            treeSet1.add(nodeC);
        }catch (Exception e){
            System.out.println("错误信息："+e.getMessage());
        }
        System.out.println("===========================================");
        TreeSet<Node> treeSet=new TreeSet<>(new NodeComparator());
        try{
            nodeA=new Node(2);
            nodeB=new Node(3);
            nodeC=new Node(4);
            treeSet.add(nodeA);
            treeSet.add(nodeB);
            treeSet.add(nodeC);
            System.out.println("这次节点都加入了");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
