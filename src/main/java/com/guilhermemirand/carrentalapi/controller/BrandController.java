package com.guilhermemirand.carrentalapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {

    @GetMapping("brands")
    public ResponseEntity<String> testa() {
        return ResponseEntity.ok("Brand Teste");
    }
}
