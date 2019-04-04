package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@Controller
public class DemoController {

    @ModelAttribute
    public void addAttributes(Model model) {
        List<String> menus = Arrays.asList("HOME", "ABOUT", "COURSE", "BLOG", "CONTACT");
        model.addAttribute("menus", menus);
    }

    @GetMapping({"/", "index"})
    public String index(Model model) {

        return "index";
    }

    @GetMapping("/detail")
    public String viewRetailerAuthorityDetail(Model model) {

        return "blog";
    }
}
