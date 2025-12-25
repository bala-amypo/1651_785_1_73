// src/main/java/com/example/demo/model/AuditLogRecord.java
package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")
@Data
public class AuditLogRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "request_id")
    private Long requestId;
    
    @Column(name = "event_type", nullable = false)
    private String eventType;
    
    private String details;
    
    private LocalDateTime timestamp = LocalDateTime.now();
}
