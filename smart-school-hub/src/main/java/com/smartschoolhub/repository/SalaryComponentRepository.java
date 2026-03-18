package com.smartschoolhub.repository;

import com.smartschoolhub.domain.SalaryComponent;
import com.smartschoolhub.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalaryComponentRepository extends JpaRepository<SalaryComponent, Long> {
    List<SalaryComponent> findByTeacher(Teacher teacher);
}
