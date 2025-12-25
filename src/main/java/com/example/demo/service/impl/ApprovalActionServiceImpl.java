package com.example.demo.service.impl;

import com.example.demo.entity.ApprovalAction;
import com.example.demo.repository.ApprovalActionRepository;
import com.example.demo.service.ApprovalActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalActionServiceImpl implements ApprovalActionService {

    @Autowired
    private ApprovalActionRepository repository;

    @Override
    public ApprovalAction save(ApprovalAction action) {
        return repository.save(action);
    }
}
