package com.placementpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/daily-challenge")
@CrossOrigin(origins = "*")
public class DailyChallengeController {

    @GetMapping
    public ResponseEntity<?> getDailyChallenge() {
        return ResponseEntity.ok(Map.of(
            "id", 1,
            "problemNumber", 1,
            "title", "Two Sum",
            "difficulty", "Easy",
            "bonusCredits", 30,
            "description", "Given an array of integers nums and an integer target, return indices of two numbers that add up to target.",
            "status", "Active"
        ));
    }
}
