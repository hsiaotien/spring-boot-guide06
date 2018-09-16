package com.dev.guide06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.dev.guide06.mapper") //注意这个MapperScan注解要区分是tx的还是org的
public class Guide06Application {

    public static void main(String[] args) {
        SpringApplication.run(Guide06Application.class,args);
    }
}
