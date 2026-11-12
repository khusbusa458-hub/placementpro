package com.placementpro.repository;

import com.placementpro.model.Reward;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RewardRepository extends MongoRepository<Reward, String> {
}
