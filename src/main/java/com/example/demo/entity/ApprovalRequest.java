// src/main/java/com/example/demo/model/ApprovalRequest.java
package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "approval_requests")
@Data
public class ApprovalRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "template_id", nullable = false)
    private Long templateId;
    
    @Column(name = "requester_id", nullable = false)
    private Long requesterId;
    
    @Column(name = "request_title", nullable = false)
    private String requestTitle;
    
    @Column(name = "request_payload_json", columnDefinition = "TEXT")
    private String requestPayloadJson;
    
    private String status = "PENDING";
}
