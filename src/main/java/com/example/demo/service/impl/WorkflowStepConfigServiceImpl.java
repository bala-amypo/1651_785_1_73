package com.example.demo.service.impl;

import com.example.demo.entity.WorkflowStepConfig;
import com.example.demo.repository.WorkflowStepConfigRepository;
import com.example.demo.service.WorkflowStepConfigService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowStepConfigServiceImpl implements WorkflowStepConfigService {

    private final WorkflowStepConfigRepository repository;

    public WorkflowStepConfigServiceImpl(WorkflowStepConfigRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<WorkflowStepConfig> getStepsByTemplate(Long templateId) {
        List<WorkflowStepConfig> allSteps = repository.findAll();
        List<WorkflowStepConfig> result = new ArrayList<>();
        for (WorkflowStepConfig s : allSteps) {
            if (s.getTemplateId().equals(templateId)) result.add(s);
        }
        return result;
    }
}
