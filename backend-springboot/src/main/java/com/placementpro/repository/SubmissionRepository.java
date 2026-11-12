package com.placementpro.repository;

import com.placementpro.model.Submission;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SubmissionRepository extends MongoRepository<Submission, String> {
    List<Submission> findByUserIdOrderBySubmittedAtDesc(String userId);
}
