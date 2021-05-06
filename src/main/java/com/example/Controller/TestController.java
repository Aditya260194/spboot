package com.example.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/all")
    public String getAll(){
        System.out.println("Output");
        return "Output";
    }

}

