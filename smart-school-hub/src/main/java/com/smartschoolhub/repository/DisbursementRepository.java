package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Disbursement;
import com.smartschoolhub.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DisbursementRepository extends JpaRepository<Disbursement, Long> {
    List<Disbursement> findByStudentOrderByDisbursementDateDesc(Student student);
}
