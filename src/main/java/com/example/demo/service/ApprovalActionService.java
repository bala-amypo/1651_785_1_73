package com.example.demo.service;

import com.example.demo.model.ApprovalAction;

import java.util.List;

public interface ApprovalActionService {
    ApprovalAction saveAction(ApprovalAction action);
    List<ApprovalAction> findByLevelNumberAndAction(int levelNumber, String action);
}
