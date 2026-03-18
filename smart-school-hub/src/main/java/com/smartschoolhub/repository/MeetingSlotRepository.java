package com.smartschoolhub.repository;

import com.smartschoolhub.domain.MeetingSlot;
import com.smartschoolhub.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface MeetingSlotRepository extends JpaRepository<MeetingSlot, Long> {
    List<MeetingSlot> findByTeacherAndStartTimeBetween(Teacher teacher, LocalDateTime start, LocalDateTime end);
    List<MeetingSlot> findByTeacherAndIsBookedFalse(Teacher teacher);
}
