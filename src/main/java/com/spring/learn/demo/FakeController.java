package com.spring.learn.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fake-controller")
public class FakeController {

    @GetMapping
    public ResponseEntity<String> greeting(){
        // TODO testing via Postman
        return ResponseEntity.ok("Hello From Secured Endpoint");
    }
}
