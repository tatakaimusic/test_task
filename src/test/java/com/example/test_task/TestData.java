package com.example.test_task;

import java.util.Map;
import java.util.TreeMap;

public class TestData {

    public final static String STRING = "aaabbbbccd";

    public static Map<Character, Integer> getMapWithCharacterFrequency() {
        Map<Character, Integer> letters = new TreeMap<>((o1, o2) -> 1);
        letters.put('b', 4);
        letters.put('a', 3);
        letters.put('c', 2);
        letters.put('d', 1);
        return letters;
    }

}
