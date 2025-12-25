package com.example.demo.service;

import com.example.demo.entity.WorkflowStepConfig;
import java.util.List;

public interface WorkflowStepConfigService {

    WorkflowStepConfig save(WorkflowStepConfig step);

    List<WorkflowStepConfig> getStepsByTemplateId(Long templateId);
}
