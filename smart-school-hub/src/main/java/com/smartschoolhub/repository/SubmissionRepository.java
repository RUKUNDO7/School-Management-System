package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Assignment;
import com.smartschoolhub.domain.Student;
import com.smartschoolhub.domain.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByAssignment(Assignment assignment);
    Optional<Submission> findByAssignmentAndStudent(Assignment assignment, Student student);
}
