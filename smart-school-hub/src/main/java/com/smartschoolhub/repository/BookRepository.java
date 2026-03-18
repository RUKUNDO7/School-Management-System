package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
