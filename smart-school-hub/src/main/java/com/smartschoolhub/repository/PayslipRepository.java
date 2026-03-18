package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Payslip;
import com.smartschoolhub.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface PayslipRepository extends JpaRepository<Payslip, Long> {
    List<Payslip> findByTeacherOrderByPaymentDateDesc(Teacher teacher);
    Optional<Payslip> findByTeacherAndMonthYear(Teacher teacher, String monthYear);
}
