package com.mym.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1_Entry {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"d");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
