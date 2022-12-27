package com.reportinventory;

public class BusinessService {
    int count=0;
    public int increment(){
        int intVal=count;
        count = intVal+1;
        return intVal;
    }
}
