package com.test.spring.controller;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testc")
public class TestController {

    @GetMapping("/test")
    public String Test() {
        return "MyTest";
    }


    @SneakyThrows(InterruptedException.class)
    @GetMapping("/test1")
    public String Test1() {
        int i=0;
        while (++i < 100) {
            Thread.sleep(1000);
        }
        return "MyTest1";
    }
}