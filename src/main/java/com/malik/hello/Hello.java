package com.malik.hello;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class Hello {
    public Optional<String> getGreeting() {
        log.info("Hello World");
        return "Hello World".describeConstable();
    }
}
