package com.reportinventory;

import java.util.*;

public class CollectionExample {
    public static Iterator reverse(List list){
        Collections.reverse(list);
        return list.iterator();
    }
/*
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object obj: reverse(list)){

        }
    }*/

    /*public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("HCL");
        queue.add("TECH");
        queue.add("CHENNAI");
        queue.add("BRANCH");
        while (queue.size()!=0){
            System.out.println(queue.poll());
        }
    }*/
}
