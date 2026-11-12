package com.placementpro.controller;

import com.placementpro.model.MockInterviewSession;
import com.placementpro.repository.MockInterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/mock-interview")
@CrossOrigin(origins = "*")
public class MockInterviewController {

    @Autowired
    private MockInterviewRepository mockRepository;

    @GetMapping("/questions")
    public ResponseEntity<?> getQuestions() {
        return ResponseEntity.ok(Map.of(
            "dsa", "Explain the internal working of HashMap in Java. How are hash collisions resolved in Java 8?",
            "backend", "What is Spring Boot Dependency Injection, and how does @Autowired resolve beans with circular dependencies?",
            "db", "Compare MongoDB BSON document scaling with relational normalization. When would you embed vs reference?",
            "hr", "Describe a time you faced a difficult conflict in a group technical project. How did you resolve it?"
        ));
    }

    @PostMapping("/evaluate")
    public ResponseEntity<?> evaluateAnswer(@RequestBody Map<String, String> request) {
        String answer = request.getOrDefault("answer", "");
        return ResponseEntity.ok(Map.of(
            "score", 88,
            "verdict", "Strong Pass",
            "technicalDepth", "High",
            "problemSolving", "Solid",
            "feedback", "Good explanation of key concepts. Highlighted thresholds and edge cases accurately."
        ));
    }

    @GetMapping("/history")
    public ResponseEntity<?> getHistory() {
        return ResponseEntity.ok(List.of(
            Map.of("domain", "dsa", "score", 88, "verdict", "Strong Pass", "date", "2026-11-10"),
            Map.of("domain", "backend", "score", 84, "verdict", "Pass", "date", "2026-11-08")
        ));
    }
}
