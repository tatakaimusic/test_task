package com.example.test_task.service;

import java.util.Map;

public interface StringService {

    /**
     * Get frequency of character in string.
     * @param string
     * @return Map<Character, Integer>
     */
    Map<Character, Integer> getFrequency(String string);

}
