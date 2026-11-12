package com.placementpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class HealthController {

    @GetMapping("/api/health")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "PlacementPro Backend API",
            "database", "MongoDB Atlas (Database: placementpro)",
            "timestamp", LocalDateTime.now().toString(),
            "version", "1.0.0"
        ));
    }

    @GetMapping("/")
    public ResponseEntity<?> rootCheck() {
        return ResponseEntity.ok(Map.of(
            "message", "PlacementPro Spring Boot Backend API is running.",
            "healthCheck", "/api/health",
            "documentation", "https://github.com/khusbusa458-hub/placementpro"
        ));
    }
}
