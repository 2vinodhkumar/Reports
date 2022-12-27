package com.reportinventory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Parent {
    public static void myFunction(String str){
        System.out.println("String");
    }
    public static void myFunction(Object obj){
        System.out.println("Object");
    }

    public static void main(String[] args) throws InterruptedException {
//        myFunction(null);
       /* String dateTime = "12/12/2022" + "10:50:50";
        "20221224" "101232234"
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss.SSS");
        simpleDateFormat.format()*/
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        long x=0;
        do {
            x++;
//            Thread.currentThread().wait(10000);
            System.out.println(calendar.getTime());
        }while (x<10000);

        System.out.println(calendar.getTime());
    }
}
