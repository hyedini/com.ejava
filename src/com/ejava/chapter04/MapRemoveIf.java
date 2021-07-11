package com.ejava.chapter04;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveIf {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "value 1");
        map.put(2, "value 2");
        map.put(3, "value 3");
        map.put(4, "value 4");
        map.put(5, "value 5");
        System.out.println(map.values());

        // remove by value
        map.values().removeIf(value -> !value.contains("1"));
        // remove by key
        map.keySet().removeIf(key -> key != 1);
        // remove by entry / combination of key + value
        map.entrySet().removeIf(entry -> entry.getKey() != 1);

        System.err.println(map.values());
    }
}
