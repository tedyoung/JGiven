package com.tngtech.jgiven.integration.spring.test;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public String computeSomething() {
        return "result";
    }
}
