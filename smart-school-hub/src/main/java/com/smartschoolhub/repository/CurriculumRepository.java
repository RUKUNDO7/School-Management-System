package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Curriculum;
import com.smartschoolhub.domain.SchoolClass;
import com.smartschoolhub.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CurriculumRepository extends JpaRepository<Curriculum, Long> {
    List<Curriculum> findBySchoolClass(SchoolClass schoolClass);
    Optional<Curriculum> findBySchoolClassAndSubject(SchoolClass schoolClass, Subject subject);
}
