package com.wzy.mallcat.front;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Wen
 */
@SpringBootApplication
@EnableDubbo
@ServletComponentScan("com.wzy.mallcat.front.rest")
@EnableCasClient
public class Application extends CasClientConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
