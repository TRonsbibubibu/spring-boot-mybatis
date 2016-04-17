package com.trons;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by trons on 16-4-17.
 */
@SpringBootApplication
@MapperScan("com.trons.mapper")
public class Applicatoin {

    public static void main(String[] args) {
        SpringApplication.run(Applicatoin.class, args);
    }
}
