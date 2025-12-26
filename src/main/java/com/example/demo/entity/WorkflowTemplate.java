package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "workflow_templates")
@Data
public class WorkflowTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String templateName;
    
    private String description;
    
    @Column(name = "total_levels")
    private Integer totalLevels;
    
    private Boolean active = true;
}
