package org.example.apptwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/helloPass")
    public String MessagePass() {
        return "HellomessagePass";
    }
    @GetMapping("/helloFail")
    public String MessageFail() {
        return "HellomessageFailed";
    }
}
