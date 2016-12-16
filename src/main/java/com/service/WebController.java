package com.service;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        return "index";
    }

    @RequestMapping("/addcompany")
    public String addCompany(Map<String, Object> model) {
        return "addcompany";
    }
    
    @RequestMapping("/updatecompany")
    public String updatCompany(Map<String, Object> model) {
        return "updatecompany";
    }
}
