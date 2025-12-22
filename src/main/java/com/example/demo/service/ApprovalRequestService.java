package com.example.demo.service;

import com.example.demo.entity.ApprovalRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ApprovalRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;

    public ApprovalRequestService(ApprovalRequestRepository approvalRequestRepository) {
        this.approvalRequestRepository = approvalRequestRepository;
    }

    public ApprovalRequest getRequestById(Long id) {
        return approvalRequestRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("ApprovalRequest not found with id: " + id));
    }
}

