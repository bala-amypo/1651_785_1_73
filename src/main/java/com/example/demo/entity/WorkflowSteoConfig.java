// src/main/java/com/example/demo/entity/WorkflowStepConfig.java
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "workflow_step_configs")
@Data
public class WorkflowStepConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "template_id", nullable = false)
    private Long templateId;
    
    @Column(name = "level_number", nullable = false)
    private Integer levelNumber;
    
    @Column(name = "approver_role", nullable = false)
    private String approverRole;
    
    private String instructions;
}
