package com.example.test_task.service.impl;

import com.example.test_task.service.StringService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StringServiceImpl implements StringService {

    @Override
    public Map<Character, Integer> getFrequency(String string) {
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            letters.merge(string.charAt(i), 1, Integer::sum);
        }
        Map<Character, Integer> sortedLetters = new TreeMap<>((o1, o2) -> {
            if (letters.get(o1) >= letters.get(o2)) {
                return -1;
            } else {
                return 1;
            }
        });
        sortedLetters.putAll(letters);
        return sortedLetters;
    }

}
