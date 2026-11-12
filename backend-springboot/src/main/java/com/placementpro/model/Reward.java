package com.placementpro.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "rewards")
public class Reward {
    @Id
    private String id;
    private String title;
    private String description;
    private int creditCost;
    private String category;
    private String icon;
    private boolean active = true;
}
