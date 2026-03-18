package com.smartschoolhub.repository;

import com.smartschoolhub.domain.CanteenOrder;
import com.smartschoolhub.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CanteenOrderRepository extends JpaRepository<CanteenOrder, Long> {
    List<CanteenOrder> findByStudentOrderByOrderDateDesc(Student student);
    List<CanteenOrder> findByOrderDateBetween(LocalDateTime start, LocalDateTime end);
}
