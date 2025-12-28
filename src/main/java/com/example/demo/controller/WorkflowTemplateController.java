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
    public ResponseEntity<WorkflowTemplate> create(@RequestBody WorkflowTemplate template) {
        return ResponseEntity.ok(templateService.createTemplate(template));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkflowTemplate> get(@PathVariable Long id) {
        return templateService.getTemplateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkflowTemplate> update(@PathVariable Long id,
                                                   @RequestBody WorkflowTemplate template) {
        return ResponseEntity.ok(templateService.updateTemplate(id, template));
    }

    @PatchMapping("/{id}/active")
    public ResponseEntity<WorkflowTemplate> activate(@PathVariable Long id,
                                                     @RequestParam boolean active) {
        return ResponseEntity.ok(templateService.activateTemplate(id, active));
    }

    @GetMapping
    public ResponseEntity<List<WorkflowTemplate>> list() {
        return ResponseEntity.ok(templateService.getAllTemplates());
    }
}
