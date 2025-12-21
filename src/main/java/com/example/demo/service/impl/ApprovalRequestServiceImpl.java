package com.example.demo.service.impl;

import com.example.demo.entity.ApprovalRequest;
import com.example.demo.repository.*;
import com.example.demo.service.ApprovalRequestService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ApprovalRequestServiceImpl implements ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;
    private final WorkflowStepConfigRepository workflowStepConfigRepository;
    private final WorkflowTemplateRepository workflowTemplateRepository;
    private final ApprovalActionRepository approvalActionRepository;

    public ApprovalRequestServiceImpl(
            ApprovalRequestRepository approvalRequestRepository,
            WorkflowStepConfigRepository workflowStepConfigRepository,
            WorkflowTemplateRepository workflowTemplateRepository,
            ApprovalActionRepository approvalActionRepository) {

        this.approvalRequestRepository = approvalRequestRepository;
        this.workflowStepConfigRepository = workflowStepConfigRepository;
        this.workflowTemplateRepository = workflowTemplateRepository;
        this.approvalActionRepository = approvalActionRepository;
    }

    @Override
    public ApprovalRequest createRequest(ApprovalRequest request) {
        request.setStatus("PENDING");
        request.setCreatedAt(LocalDateTime.now());
        request.setCurrentLevel(1);

        return approvalRequestRepository.save(request);
    }

    @Override
    public List<ApprovalRequest> getRequestsByRequester(Long requesterId) {
        return approvalRequestRepository.findAll()
                .stream()
                .filter(r -> requesterId.equals(r.getRequesterId()))
                .toList();
    }

    @Override
    public List<ApprovalRequest> getAllRequests() {
        return approvalRequestRepository.findAll();
    }
}
