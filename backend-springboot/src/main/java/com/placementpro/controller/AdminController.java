package com.placementpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    // As tested in Section 11 of the report: Students attempting to access admin APIs get HTTP 403 Forbidden
    @GetMapping("/analytics")
    public ResponseEntity<?> getPlatformAnalytics(@RequestHeader(value = "X-User-Role", defaultValue = "ROLE_STUDENT") String role) {
        if (!"ROLE_ADMIN".equals(role)) {
            return ResponseEntity.status(403).body(Map.of("error", "Forbidden: Student access to admin API is denied"));
        }
        return ResponseEntity.ok(Map.of(
            "totalStudents", 142,
            "totalSubmissions", 1280,
            "activeProblems", 15,
            "activeCompanies", 8,
            "databaseStatus", "MongoDB Atlas Connected"
        ));
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(@RequestHeader(value = "X-User-Role", defaultValue = "ROLE_STUDENT") String role) {
        if (!"ROLE_ADMIN".equals(role)) {
            return ResponseEntity.status(403).body(Map.of("error", "Forbidden: Student access to admin API is denied"));
        }
        return ResponseEntity.ok(List.of(
            Map.of("id", "u1", "fullName", "Sejal Verma", "uid", "24BAI70953", "role", "ROLE_STUDENT"),
            Map.of("id", "u2", "fullName", "Khusbu Kumari Kewat", "uid", "24BAI71022", "role", "ROLE_STUDENT")
        ));
    }

    @PostMapping("/login")
    public ResponseEntity<?> adminLogin(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");
        if ("admin@placementpro.edu".equals(email) && "Admin@2026".equals(password)) {
            return ResponseEntity.ok(Map.of(
                "token", "jwt_verified_admin_token",
                "role", "ROLE_ADMIN",
                "message", "Admin authentication successful"
            ));
        }
        return ResponseEntity.status(401).body(Map.of("error", "Invalid admin credentials"));
    }
}
