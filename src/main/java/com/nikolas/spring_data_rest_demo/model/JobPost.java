package com.nikolas.spring_data_rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;

//    @ElementCollection
//    @CollectionTable(name = "post_tech_stack", joinColumns = @JoinColumn(name = "post_id"))
//    @Column(name = "tech_stack")
    private List<String> postTechStack;
}
