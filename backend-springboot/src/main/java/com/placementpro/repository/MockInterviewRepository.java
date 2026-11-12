package com.placementpro.repository;

import com.placementpro.model.MockInterviewSession;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MockInterviewRepository extends MongoRepository<MockInterviewSession, String> {
    List<MockInterviewSession> findByUserIdOrderBySessionDateDesc(String userId);
}
