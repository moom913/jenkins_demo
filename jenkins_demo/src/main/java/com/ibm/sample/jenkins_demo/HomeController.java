package com.ibm.sample.jenkins_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/home")
    public String home() {
        return "Hello IBM";
    }
}
