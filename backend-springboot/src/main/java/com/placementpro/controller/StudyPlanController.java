package com.placementpro.controller;

import com.placementpro.model.StudyPlan;
import com.placementpro.repository.StudyPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/study-plan")
@CrossOrigin(origins = "*")
public class StudyPlanController {

    @Autowired
    private StudyPlanRepository studyPlanRepository;

    @GetMapping
    public ResponseEntity<?> getStudyPlan() {
        List<Map<String, Object>> tasks = new ArrayList<>();
        tasks.add(Map.of("id", "1", "title", "Array & Hash Table Fundamentals (Two Sum)", "completed", true));
        tasks.add(Map.of("id", "2", "title", "String Manipulation & Sliding Window", "completed", true));
        tasks.add(Map.of("id", "3", "title", "Linked List Cycle & Reversal", "completed", true));
        tasks.add(Map.of("id", "4", "title", "Stack & Monotonic Queue Operations", "completed", true));
        tasks.add(Map.of("id", "5", "title", "Binary Tree DFS/BFS Traversals", "completed", true));
        tasks.add(Map.of("id", "6", "title", "Binary Search Trees Search Space", "completed", true));
        tasks.add(Map.of("id", "7", "title", "Dynamic Programming - 1D Subproblems", "completed", false));
        tasks.add(Map.of("id", "8", "title", "Graph Algorithms (Dijkstra, TopoSort)", "completed", false));
        tasks.add(Map.of("id", "9", "title", "Low-Level System Design (SOLID)", "completed", false));
        tasks.add(Map.of("id", "10", "title", "Mock Technical Screening & Resume Audit", "completed", true));

        return ResponseEntity.ok(Map.of(
            "targetCompany", "Google / Amazon",
            "progressPercentage", 60,
            "tasks", tasks
        ));
    }

    @PostMapping("/tasks/{taskId}/toggle")
    public ResponseEntity<?> toggleTask(@PathVariable String taskId) {
        return ResponseEntity.ok(Map.of(
            "taskId", taskId,
            "updated", true,
            "timestamp", LocalDateTime.now().toString()
        ));
    }

    @PostMapping("/select-company")
    public ResponseEntity<?> selectCompany(@RequestBody Map<String, String> payload) {
        String company = payload.getOrDefault("companyName", "Google");
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "activeCompany", company,
            "message", "Study plan customized for " + company
        ));
    }
}
