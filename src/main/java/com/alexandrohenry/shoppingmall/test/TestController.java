package com.alexandrohenry.shoppingmall.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/home")
    public String test(){
        return "<h1>Hello Spring World</h1>";
    }

}
