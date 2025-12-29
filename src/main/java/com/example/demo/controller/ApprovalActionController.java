// package com.example.demo.controller;

// import com.example.demo.model.ApprovalAction;
// import com.example.demo.service.ApprovalActionService;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/actions")
// public class ApprovalActionController {

//     private final ApprovalActionService approvalActionService;

//     public ApprovalActionController(ApprovalActionService approvalActionService) {
//         this.approvalActionService = approvalActionService;
//     }

//     @PostMapping
//     public ResponseEntity<ApprovalAction> createAction(@RequestBody ApprovalAction action) {
//         ApprovalAction saved = approvalActionService.saveAction(action);
//         return new ResponseEntity<>(saved, HttpStatus.CREATED);
//     }

//     @GetMapping
//     public ResponseEntity<List<ApprovalAction>> getByLevelAndAction(
//             @RequestParam("levelNumber") int levelNumber,
//             @RequestParam("action") String action) {

//         List<ApprovalAction> list = approvalActionService.findByLevelAndAction(levelNumber, action);
//         return ResponseEntity.ok(list);
//     }
// }
