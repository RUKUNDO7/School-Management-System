package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Assignment;
import com.smartschoolhub.domain.Subject;
import com.smartschoolhub.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findBySubject(Subject subject);
    List<Assignment> findByTeacher(Teacher teacher);
}
