// src/main/java/com/example/demo/entity/ApprovalAction.java
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "approval_actions")
@Data
public class ApprovalAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "request_id", nullable = false)
    private Long requestId;
    
    @Column(name = "approver_id", nullable = false)
    private Long approverId;
    
    @Column(name = "level_number", nullable = false)
    private Integer levelNumber;
    
    private String action;
}
