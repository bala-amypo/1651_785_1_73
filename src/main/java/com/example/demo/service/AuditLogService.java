package com.example.demo.service;

import com.example.demo.model.AuditLogRecord;

import java.util.List;

public interface AuditLogService {
    AuditLogRecord saveLog(AuditLogRecord record);
    List<AuditLogRecord> getLogsForRequest(Long requestId);
}
