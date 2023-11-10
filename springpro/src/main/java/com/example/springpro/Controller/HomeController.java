package com.example.springpro.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/getMsg")
    public String getMessage(){
        return "Hello...";
}
}
