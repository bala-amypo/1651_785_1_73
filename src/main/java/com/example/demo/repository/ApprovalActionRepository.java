package com.example.demo.repository;

import com.example.demo.entity.ApprovalAction;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ApprovalActionRepository
        extends JpaRepository<ApprovalAction, Long> {

    @Query("SELECT a FROM ApprovalAction a WHERE a.levelNumber = :level AND a.action = :action")
    List<ApprovalAction> findByLevelAndAction(
            @Param("level") int level,
            @Param("action") String action
    );
}
