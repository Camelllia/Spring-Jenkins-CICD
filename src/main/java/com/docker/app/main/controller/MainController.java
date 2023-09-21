package com.docker.app.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/github-webhook")
    public ResponseEntity<?> webhook() {
        return new ResponseEntity<>("---- Jenkins CI & CD With Github Webhook ----", HttpStatus.OK);
    }

    @GetMapping("/jenkins")
    public ResponseEntity<?> jenkins() {
        return new ResponseEntity<>("Jenkins", HttpStatus.OK);
    }
}
