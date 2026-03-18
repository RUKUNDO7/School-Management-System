package com.smartschoolhub.repository;

import com.smartschoolhub.domain.HealthRecord;
import com.smartschoolhub.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {
    List<HealthRecord> findByStudentOrderByRecordDateDesc(Student student);
}
