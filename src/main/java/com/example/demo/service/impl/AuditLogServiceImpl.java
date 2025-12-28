package com.example.demo.service.impl;

import com.example.demo.model.AuditLog;
import com.example.demo.repository.AuditLogRepository;
import com.example.demo.service.AuditLogService;
import org.springframework.stereotype.Service;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    private final AuditLogRepository auditLogRepository;

    public AuditLogServiceImpl(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Override
    public AuditLog saveLog(AuditLog log) {
        return auditLogRepository.save(log);
    }
}
