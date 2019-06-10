package com.example.importexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.importexcel.dao")
@SpringBootApplication
public class ImportexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportexcelApplication.class, args);
        //hahahhahh
    }
}
