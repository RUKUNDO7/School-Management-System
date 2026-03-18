package com.smartschoolhub.repository;

import com.smartschoolhub.domain.BedAllocation;
import com.smartschoolhub.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BedAllocationRepository extends JpaRepository<BedAllocation, Long> {
    Optional<BedAllocation> findByStudentAndReleaseDateIsNull(Student student);
}
