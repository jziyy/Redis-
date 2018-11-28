package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map a = new HashMap();
        a.put(1,1);
        a.put(2,1);
        a.put(3,1);
        a.put(4,1);
        a.put(5,1);
        Map b = new HashMap();
        b.put(2,2);
        b.put(9,9);
        a.putAll(b);
        System.out.println(a);


    }
}
