package com.wzy.mallcat.member;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wen
 */
@SpringBootApplication
@ComponentScan("com.wzy.mallcat")
@EnableDubbo
@DubboComponentScan(basePackages = "com.wzy.mallcat.member.service")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
