package com.placementpro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/leaderboard")
@CrossOrigin(origins = "*")
public class LeaderboardController {

    @GetMapping
    public ResponseEntity<?> getLeaderboard() {
        return ResponseEntity.ok(List.of(
            Map.of("rank", 1, "fullName", "Sejal Verma", "uid", "24BAI70953", "section", "24ML-12B", "problemsSolved", 15, "streak", 18, "credits", 850),
            Map.of("rank", 2, "fullName", "Khusbu Kumari Kewat", "uid", "24BAI71022", "section", "24ML-12B", "problemsSolved", 14, "streak", 16, "credits", 790),
            Map.of("rank", 3, "fullName", "Aman Gupta", "uid", "24BAI70940", "section", "24ML-12B", "problemsSolved", 13, "streak", 14, "credits", 720),
            Map.of("rank", 4, "fullName", "Rahul Sharma", "uid", "24BAI70811", "section", "24ML-12A", "problemsSolved", 11, "streak", 10, "credits", 580),
            Map.of("rank", 5, "fullName", "Ananya Iyer", "uid", "24BAI70912", "section", "24ML-11B", "problemsSolved", 10, "streak", 9, "credits", 540)
        ));
    }
}
