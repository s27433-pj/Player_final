package org.example.appone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "HelloService", url = "http://localhost:8081")


public interface CommunicationClient {
    @GetMapping("/hello")
    String MessagePass();



    @GetMapping("/helloFail")
    String MessageFail();
}
