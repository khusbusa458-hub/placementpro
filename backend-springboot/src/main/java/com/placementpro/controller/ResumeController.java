package com.placementpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin(origins = "*")
public class ResumeController {

    @PostMapping("/analyze")
    public ResponseEntity<?> analyzeResume(@RequestBody Map<String, String> request) {
        String resumeText = request.getOrDefault("resumeText", "");
        return ResponseEntity.ok(Map.of(
            "atsScore", 92,
            "verdict", "Placement Ready",
            "detectedKeywords", List.of("Java", "Spring Boot", "React", "MongoDB", "REST", "Algorithms"),
            "strengths", "Strong full-stack architectural keywords and verified Capstone project.",
            "recommendations", List.of("Add measurable metrics (e.g. latency improvement, user throughput)", "Highlight unit testing coverage")
        ));
    }
}
