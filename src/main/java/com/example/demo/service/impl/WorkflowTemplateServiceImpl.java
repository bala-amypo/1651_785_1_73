package com.example.demo.service.impl;

import com.example.demo.entity.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import com.example.demo.service.WorkflowTemplateService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowTemplateServiceImpl implements WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateServiceImpl(WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkflowTemplate createTemplate(WorkflowTemplate template) {
        // simulate save by assigning ID manually
        List<WorkflowTemplate> allTemplates = repository.findAll();
        template.setId((long) (allTemplates.size() + 1));
        allTemplates.add(template);
        return template;
    }

    @Override
    public WorkflowTemplate getTemplateById(Long id) {
        List<WorkflowTemplate> allTemplates = repository.findAll();
        for (WorkflowTemplate t : allTemplates) {
            if (t.getId().equals(id)) return t;
        }
        return null; // or throw an exception
    }

    @Override
    public List<WorkflowTemplate> getAllTemplates() {
        return new ArrayList<>(repository.findAll());
    }

    @Override
    public List<WorkflowTemplate> getActiveTemplates() {
        List<WorkflowTemplate> allTemplates = repository.findAll();
        List<WorkflowTemplate> activeList = new ArrayList<>();
        for (WorkflowTemplate t : allTemplates) {
            if (Boolean.TRUE.equals(t.getActive())) activeList.add(t);
        }
        return activeList;
    }
}
