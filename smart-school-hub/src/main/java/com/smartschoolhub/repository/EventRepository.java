package com.smartschoolhub.repository;

import com.smartschoolhub.domain.SchoolEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<SchoolEvent, Long> {
}
