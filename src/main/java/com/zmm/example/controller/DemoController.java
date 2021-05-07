package com.zmm.example.controller;

import com.zmm.starter.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zmm
 * @time: 2021/5/7 10:33
 */
@RestController
public class DemoController {

    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat(){
        return demoService.say();
    }
}
