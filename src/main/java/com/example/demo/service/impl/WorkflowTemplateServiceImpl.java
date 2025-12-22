package com.example.demo.service.impl;

import com.example.demo.entity.WorkflowTemplate;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.WorkflowTemplateRepository;
import com.example.demo.service.WorkflowTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkflowTemplateServiceImpl implements WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateServiceImpl(
            WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkflowTemplate save(WorkflowTemplate template) {
        return repository.save(template);
    }

    @Override
    public WorkflowTemplate getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Workflow Template not found with id " + id));
    }

    @Override
    public List<WorkflowTemplate> getAll() {
        return repository.findAll();
    }
}
