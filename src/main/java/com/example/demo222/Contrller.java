package com.example.demo222;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class Contrller {

    @RequestMapping("/info")
    public String pp(){
        return "66666666666666666666666666";
    }
}
