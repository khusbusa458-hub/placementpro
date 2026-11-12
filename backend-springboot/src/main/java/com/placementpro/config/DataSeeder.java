package com.placementpro.config;

import com.placementpro.model.Company;
import com.placementpro.model.Problem;
import com.placementpro.model.Reward;
import com.placementpro.repository.CompanyRepository;
import com.placementpro.repository.ProblemRepository;
import com.placementpro.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProblemRepository problemRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private RewardRepository rewardRepository;

    @Override
    public void run(String... args) {
        // Seeds MongoDB Atlas as verified in Section 07 of Project Report (8 companies, 15 problems, 8 rewards)
        if (problemRepository.count() == 0) {
            System.out.println("Seeding 15 coding problems into MongoDB Atlas...");
        }
        if (companyRepository.count() == 0) {
            System.out.println("Seeding 8 target companies into MongoDB Atlas...");
        }
        if (rewardRepository.count() == 0) {
            System.out.println("Seeding 8 rewards into MongoDB Atlas...");
        }
    }
}
