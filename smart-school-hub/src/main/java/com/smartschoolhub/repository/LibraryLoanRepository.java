package com.smartschoolhub.repository;

import com.smartschoolhub.domain.LibraryLoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryLoanRepository extends JpaRepository<LibraryLoan, Long> {
}
