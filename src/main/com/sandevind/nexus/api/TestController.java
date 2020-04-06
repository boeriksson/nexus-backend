package com.sandevind.nexus.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/")
    public @ResponseBody ResponseEntity<String> test() {
        return ResponseEntity.ok().body("Shit works..");
    }
}
