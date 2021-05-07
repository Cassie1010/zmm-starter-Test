package com.zmm.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: zmm
 * @time: 2021/5/7 10:37
 */
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ZmmStarter {
    public static void main(String[] args) {
        SpringApplication.run(ZmmStarter.class);
    }
}
