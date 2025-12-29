// package com.example.demo.controller;

// import com.example.demo.model.AuditLogRecord;
// import com.example.demo.service.AuditLogService;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/audit-logs")
// public class AuditLogController {

//     private final AuditLogService auditLogService;

//     public AuditLogController(AuditLogService auditLogService) {
//         this.auditLogService = auditLogService;
//     }

//     @PostMapping
//     public ResponseEntity<AuditLogRecord> createLog(@RequestBody AuditLogRecord log) {
//         AuditLogRecord saved = auditLogService.saveLog(log);
//         return new ResponseEntity<>(saved, HttpStatus.CREATED);
//     }
// }
