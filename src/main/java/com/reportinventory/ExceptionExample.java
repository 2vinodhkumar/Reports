package com.reportinventory;

import org.springframework.security.core.parameters.P;

import java.util.PriorityQueue;

public class ExceptionExample {
    static void testThread() throws RuntimeException{
        try {
            System.out.println("Try");
            throw new RuntimeException();
        }catch (Exception exception){
            System.out.println("Catch");
        }
    }

   /* public static void main(String[] args) {
        try {
            testThread();
        }catch (RuntimeException runtimeException){
            System.out.println("Runtime");
        }
        System.out.println("End");
    }*/
   /*public static void main(String[] args) {
       int i=100;
       if(((i++)>102)&&(++i<105))
           System.out.println(i);
       else
           System.out.println(i);
   }*/
    /*static int i;
   public static void main(String[] args) {
       while ((i<0)){
           i--;
       }
       System.out.println(i);
   }*/

    public static void main(String[] args) {
        PriorityQueue<String > pq=new PriorityQueue<>();
        pq.add("java");
        pq.add("Is");
        pq.add("A");
        pq.add("Programming");
        pq.add("Language");
        for (String e:pq){
            System.out.println(e);
        }
    }
}
