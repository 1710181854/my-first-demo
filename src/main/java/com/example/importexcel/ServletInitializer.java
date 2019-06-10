package com.example.importexcel;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
//谔谔谔谔
public class ServletInitializer extends SpringBootServletInitializer {
//ddd
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ImportexcelApplication.class);
    }

}
