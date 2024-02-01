package com.example.test_task.config;

import com.example.test_task.service.StringService;
import com.example.test_task.service.impl.StringServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class TestConfig {

    @Bean
    @Primary
    public StringService stringService(){
        return new StringServiceImpl();
    }

}
