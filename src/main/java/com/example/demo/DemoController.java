package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping({"/", "index"})
    public String index() {

        return "index";
    }

    @GetMapping("/detail")
    public String viewRetailerAuthorityDetail() {

        return "blog";
    }
}
