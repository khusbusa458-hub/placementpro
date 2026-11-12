package com.placementpro.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "submissions")
public class Submission {
    @Id
    private String id;
    private String userId;
    private String problemId;
    private String problemTitle;
    private String language; // "java", "python", "javascript", "cpp", "c"
    private String code;
    private String status; // "Accepted", "Wrong Answer", "Execution Unavailable"
    private int passedTestCases;
    private int totalTestCases;
    private long runtimeMs;
    private double memoryMb;
    private int creditsAwarded;
    private LocalDateTime submittedAt = LocalDateTime.now();
}
