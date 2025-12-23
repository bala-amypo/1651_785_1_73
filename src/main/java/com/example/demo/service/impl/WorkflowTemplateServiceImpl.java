package com.example.demo.service.impl;

import com.example.demo.entity.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import com.example.demo.service.WorkflowTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkflowTemplateServiceImpl implements WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateServiceImpl(WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkflowTemplate createTemplate(WorkflowTemplate template) {
        return repository.save(template);
    }

    @Override
    public Optional<WorkflowTemplate> getTemplateById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<WorkflowTemplate> getAllTemplates() {
        return repository.findAll();
    }

    @Override
    public WorkflowTemplate updateTemplate(Long id, WorkflowTemplate template) {
        template.setId(id);
        return repository.save(template);
    }
}
