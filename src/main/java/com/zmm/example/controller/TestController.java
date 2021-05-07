package com.zmm.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zmm
 * @time: 2021/5/7 14:18
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "Ok";
    }
}
