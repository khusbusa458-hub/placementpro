package com.placementpro.controller;

import com.placementpro.model.User;
import com.placementpro.repository.UserRepository;
import com.placementpro.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubmissionRepository submissionRepository;

    @GetMapping("/profile")
    public ResponseEntity<?> getProfile(@RequestHeader(value = "Authorization", required = false) String token) {
        // Returns authenticated student profile information
        Map<String, Object> profile = new HashMap<>();
        profile.put("fullName", "Khusbu Kumari Kewat");
        profile.put("email", "khusbusa458@gmail.com");
        profile.put("uid", "24BAI71022");
        profile.put("section", "24ML-12B");
        profile.put("credits", 350);
        profile.put("streakDays", 7);
        profile.put("problemsSolved", 9);
        return ResponseEntity.ok(profile);
    }

    @GetMapping("/dashboard")
    public ResponseEntity<?> getDashboardStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("problemsSolved", 9);
        stats.put("totalProblems", 15);
        stats.put("practiceStreak", 7);
        stats.put("mockInterviewRating", "86%");
        stats.put("creditBalance", 350);
        stats.put("activeTrack", "Google / Amazon SDE Preparation");
        stats.put("trackProgress", 60);
        return ResponseEntity.ok(stats);
    }

    @GetMapping("/credits")
    public ResponseEntity<?> getCreditsBalance() {
        return ResponseEntity.ok(Map.of("balance", 350, "currency", "PlacementCredits"));
    }

    @GetMapping("/submissions")
    public ResponseEntity<?> getSubmissionsHistory() {
        return ResponseEntity.ok(submissionRepository.findAll());
    }
}
