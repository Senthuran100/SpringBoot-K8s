package com.senthuran.K8sSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> testK8sEndpoint(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
