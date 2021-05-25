package com.ro.car;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String>students = new HashMap<>();
        students.put("001", "John");
        students.put("002", "Kelly");
        students.put("003", "Willy");
        String name = students.get("001");
        System.out.println(name);
    }
}
