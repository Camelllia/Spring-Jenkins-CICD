package com.docker.app.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/jenkins-app")
    public ResponseEntity<?> jenkins() {
        return new ResponseEntity<>("------- Jenkins Build Test -------", HttpStatus.OK);
    }

    @GetMapping("/github-webhook")
    public ResponseEntity<?> webhook() {
        return new ResponseEntity<>("------- Jenkins Build & Deploy With Github Webhook  -------", HttpStatus.OK);
    }
}
