package com.example.demo.service.impl;

import com.example.demo.entity.ApprovalRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ApprovalRequestRepository;
import com.example.demo.service.ApprovalRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalRequestServiceImpl implements ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;

    public ApprovalRequestServiceImpl(
            ApprovalRequestRepository approvalRequestRepository) {
        this.approvalRequestRepository = approvalRequestRepository;
    }

    @Override
    public ApprovalRequest save(ApprovalRequest request) {
        return approvalRequestRepository.save(request);
    }

    @Override
    public ApprovalRequest getById(Long id) {
        return approvalRequestRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Approval Request not found with id " + id));
    }

    @Override
    public List<ApprovalRequest> getAllRequests() {
        return approvalRequestRepository.findAll();
    }

    @Override
    public List<ApprovalRequest> getRequestsByRequester(Long requesterId) {
        return approvalRequestRepository.findAll()
                .stream()
                .filter(r -> requesterId.equals(r.getRequesterId()))
                .toList();
    }
}
