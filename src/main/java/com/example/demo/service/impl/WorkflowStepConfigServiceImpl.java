package com.example.demo.service.impl;

import com.example.demo.entity.WorkflowStepConfig;
import com.example.demo.repository.WorkflowStepConfigRepository;
import com.example.demo.service.WorkflowStepConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkflowStepConfigServiceImpl implements WorkflowStepConfigService {

    @Autowired
    private WorkflowStepConfigRepository repository;

    @Override
    public WorkflowStepConfig save(WorkflowStepConfig step) {
        return repository.save(step);
    }

    @Override
    public List<WorkflowStepConfig> getStepsByTemplateId(Long templateId) {
        return repository.findByTemplateIdOrderByLevelNumberAsc(templateId);
    }
}
