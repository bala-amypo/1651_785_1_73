// src/main/java/com/example/demo/repository/ApprovalRequestRepository.java
package com.example.demo.repository;

import com.example.demo.entity.ApprovalRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ApprovalRequestRepository extends JpaRepository<ApprovalRequest, Long> {
    List<ApprovalRequest> findByRequesterId(Long requesterId);
}
