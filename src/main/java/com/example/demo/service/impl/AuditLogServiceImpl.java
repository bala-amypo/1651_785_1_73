package com.example.demo.service.impl;

import com.example.demo.model.AuditLogRecord;
import com.example.demo.repository.AuditLogRecordRepository;
import com.example.demo.service.AuditLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    private final AuditLogRecordRepository auditLogRecordRepository;

    // ⚠️ EXACT constructor order
    public AuditLogServiceImpl(AuditLogRecordRepository auditLogRecordRepository) {
        this.auditLogRecordRepository = auditLogRecordRepository;
    }

    @Override
    public AuditLogRecord save(AuditLogRecord record) {
        return auditLogRecordRepository.save(record);
    }

    @Override
    public List<AuditLogRecord> getLogsByRequestId(Long requestId) {
        return auditLogRecordRepository.findByRequestId(requestId);
    }
}
