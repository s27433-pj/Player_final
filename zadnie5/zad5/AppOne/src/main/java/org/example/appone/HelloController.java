package org.example.appone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController
{

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/getHello")
    public String HelloPass() {
        return helloService.HelloPass();
    }



    @GetMapping("/getHelloFail")
    public String HelloFail() {
        return helloService.HelloFail();
    }
}
