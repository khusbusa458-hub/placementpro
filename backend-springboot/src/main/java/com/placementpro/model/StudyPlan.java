package com.placementpro.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "studyplans")
public class StudyPlan {
    @Id
    private String id;
    private String userId;
    private String targetCompanyId;
    private String targetCompanyName;
    private int progressPercentage;
    private List<PlanTask> tasks;
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PlanTask {
        private String taskId;
        private String title;
        private String category;
        private boolean completed;
        private LocalDateTime completedAt;
    }
}
