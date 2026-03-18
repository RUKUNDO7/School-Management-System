package com.smartschoolhub.repository;

import com.smartschoolhub.domain.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    List<AuditLog> findByPerformedByOrderByTimestampDesc(String performedBy);
    List<AuditLog> findByEntityAndEntityIdOrderByTimestampDesc(String entity, Long entityId);
}
