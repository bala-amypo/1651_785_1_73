package com.example.demo.controller;

import com.example.demo.model.WorkflowTemplate;
import com.example.demo.service.WorkflowTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class WorkflowTemplateController {

    private final WorkflowTemplateService templateService;

    public WorkflowTemplateController(WorkflowTemplateService templateService) {
        this.templateService = templateService;
    }

    @PostMapping
    public ResponseEntity<WorkflowTemplate> createTemplate(@RequestBody WorkflowTemplate template) {
        WorkflowTemplate created = templateService.createTemplate(template);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkflowTemplate> getTemplate(@PathVariable Long id) {
        return templateService.getTemplateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkflowTemplate> updateTemplate(@PathVariable Long id,
                                                           @RequestBody WorkflowTemplate template) {
        WorkflowTemplate updated = templateService.updateTemplate(id, template);
        return ResponseEntity.ok(updated);
    }

    @GetMapping
    public ResponseEntity<List<WorkflowTemplate>> listTemplates() {
        return ResponseEntity.ok(templateService.getAllTemplates());
    }

    @PutMapping("/{id}/active")
    public ResponseEntity<WorkflowTemplate> updateActive(@PathVariable Long id,
                                                         @RequestParam boolean active) {
        WorkflowTemplate updated = templateService.activateTemplate(id, active);
        return ResponseEntity.ok(updated);
    }
}
