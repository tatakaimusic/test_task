package com.example.test_task.service.impl;

import com.example.test_task.TestData;
import com.example.test_task.config.TestConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@Import(TestConfig.class)
class StringServiceImplTest {

    private final StringServiceImpl stringService;

    @Autowired
    StringServiceImplTest(StringServiceImpl stringService) {
        this.stringService = stringService;
    }

    @Test
    void getFrequency() {
        Map<Character, Integer> result = stringService.getFrequency(TestData.STRING);
        Map<Character, Integer> expected = TestData.getMapWithCharacterFrequency();
        Assertions.assertEquals(expected.toString(), result.toString());
    }

}