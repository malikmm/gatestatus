package com.malik.hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hello {
    public String getGreeting() {
        log.info("Hello World");
        return "Hello World";
    }
}
