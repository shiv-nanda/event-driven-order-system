package com.shiv.order_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Mono<ResponseEntity<Map<String, Object>>> healthCheck() {

        Map<String, Object> response = new HashMap<>();
        response.put("service", "Order Service");
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now());

        return Mono.just(new ResponseEntity<>(response, HttpStatus.OK));
    }
}
