package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<Hostel, Long> {
}
