package com.example.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Helloworld {

    @GetMapping("/hi")
    public String Hello(String welcome ){
        return "Hello world";
    }
}
