package com.example.importexcel;
//远程直接修改，冲突远程
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.importexcel.dao")
@SpringBootApplication
public class ImportexcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportexcelApplication.class, args);
     
    }
}
