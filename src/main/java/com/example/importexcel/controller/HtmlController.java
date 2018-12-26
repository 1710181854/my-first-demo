package com.example.importexcel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/excel")
public class HtmlController {
    @RequestMapping("/in")
    public String toExcel(){
        return "excelimport";
    }
}
