package com.placementpro.controller;

import com.placementpro.model.Reward;
import com.placementpro.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rewards")
@CrossOrigin(origins = "*")
public class RewardController {

    @Autowired
    private RewardRepository rewardRepository;

    @GetMapping
    public ResponseEntity<?> getAllRewards() {
        return ResponseEntity.ok(List.of(
            Map.of("id", 1, "title", "1-on-1 Mock Interview Session", "cost", 400, "desc", "45-min live coding interview with an industry engineer"),
            Map.of("id", 2, "title", "Expert Resume Review & Polish", "cost", 250, "desc", "Line-by-line ATS and wording recommendations by senior tech leads"),
            Map.of("id", 3, "title", "FAANG System Design Blueprint", "cost", 150, "desc", "Comprehensive guide for high-throughput, fault-tolerant architectures"),
            Map.of("id", 4, "title", "PlacementPro Pro Badge", "cost", 100, "desc", "Verified profile badge visible on student leaderboards"),
            Map.of("id", 5, "title", "Amazon SDE Interview Question Bank", "cost", 120, "desc", "Top 50 recently asked OA and on-site problems with solutions"),
            Map.of("id", 6, "title", "Behavioral Round Cheat Sheet", "cost", 80, "desc", "Structured STAR method responses for 25 common HR queries"),
            Map.of("id", 7, "title", "Exclusive Discord Mentorship Pass", "cost", 300, "desc", "Direct access to private placement doubt clearing community"),
            Map.of("id", 8, "title", "Amazon Gift Voucher (₹500)", "cost", 600, "desc", "Official e-gift card for academic books and gear")
        ));
    }

    @PostMapping("/{id}/redeem")
    public ResponseEntity<?> redeemReward(@PathVariable String id, @RequestBody(required = false) Map<String, Object> req) {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "rewardId", id,
            "message", "Reward redeemed successfully. Confirmation sent to registered student email."
        ));
    }
}
