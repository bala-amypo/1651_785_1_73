package com.example.demo.service.impl;

import com.example.demo.entity.ApprovalAction;
import com.example.demo.repository.ApprovalActionRepository;
import com.example.demo.service.ApprovalActionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApprovalActionServiceImpl implements ApprovalActionService {

    private final ApprovalActionRepository approvalActionRepository;

    public ApprovalActionServiceImpl(ApprovalActionRepository approvalActionRepository) {
        this.approvalActionRepository = approvalActionRepository;
    }

    @Override
    public ApprovalAction addAction(ApprovalAction action) {
        List<ApprovalAction> allActions = approvalActionRepository.findAll();
        action.setId((long) (allActions.size() + 1));
        allActions.add(action);
        return action;
    }

    @Override
    public List<ApprovalAction> getActionsByLevelAndAction(Integer level, String actionName) {
        List<ApprovalAction> allActions = approvalActionRepository.findAll();
        List<ApprovalAction> result = new ArrayList<>();
        for (ApprovalAction a : allActions) {
            if (a.getLevel().equals(level) && a.getAction().equals(actionName)) {
                result.add(a);
            }
        }
        return result;
    }
}
