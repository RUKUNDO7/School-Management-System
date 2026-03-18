package com.smartschoolhub.repository;

import com.smartschoolhub.domain.RouteAssignment;
import com.smartschoolhub.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RouteAssignmentRepository extends JpaRepository<RouteAssignment, Long> {
    Optional<RouteAssignment> findByStudentAndEndDateIsNull(Student student);
}
