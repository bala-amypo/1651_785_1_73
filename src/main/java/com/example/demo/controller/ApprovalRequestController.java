package com.example.demo.controller;

import com.example.demo.model.ApprovalRequest;
import com.example.demo.service.ApprovalRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ApprovalRequestController {

    private final ApprovalRequestService requestService;

    public ApprovalRequestController(ApprovalRequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public ResponseEntity<ApprovalRequest> create(@RequestBody ApprovalRequest request) {
        return ResponseEntity.ok(requestService.createRequest(request));
    }

    @GetMapping("/requester/{id}")
    public ResponseEntity<List<ApprovalRequest>> byRequester(@PathVariable Long id) {
        return ResponseEntity.ok(requestService.getRequestsByRequester(id));
    }

    @GetMapping
    public ResponseEntity<List<ApprovalRequest>> all() {
        return ResponseEntity.ok(requestService.getAllRequests());
    }
}
