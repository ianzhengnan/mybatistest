package com.ian.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<String, String>();

        testMap.put("one", "Ian");
        testMap.put("two", "Flks");
        System.out.println("The first one is " + testMap.get("one"));
        System.out.println(testMap);

        Set<String> testSet = new HashSet<String>();
        testSet.add("kakka");
        testSet.add("ok");
        System.out.println(testSet);
    }
}
