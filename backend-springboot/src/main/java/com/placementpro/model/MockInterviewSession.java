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
@Document(collection = "mock_sessions")
public class MockInterviewSession {
    @Id
    private String id;
    private String userId;
    private String domain; // "dsa", "backend", "db", "hr"
    private String question;
    private String studentAnswer;
    private int score;
    private String feedback;
    private String performanceVerdict; // "Strong Pass", "Pass", "Needs Improvement"
    private LocalDateTime sessionDate = LocalDateTime.now();
}
