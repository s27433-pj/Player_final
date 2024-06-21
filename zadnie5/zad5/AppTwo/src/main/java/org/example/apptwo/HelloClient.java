package org.example.apptwo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "HelloService", url = "http://localhost:8081")
public interface HelloClient
{
    @GetMapping("/hello")
    String MessagePass();

    @GetMapping("/helloFail")
    String MessageFail();
}
