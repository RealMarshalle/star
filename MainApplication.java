package com.star.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author star
 * @Description 启动SpringBoot项目的主入口程序
 * @Creation 2023-09-14 12:14 CST
 */

@SpringBootApplication  // 注解 这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
