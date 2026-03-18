package com.smartschoolhub.repository;

import com.smartschoolhub.domain.PTMAppointment;
import com.smartschoolhub.domain.Student;
import com.smartschoolhub.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PTMAppointmentRepository extends JpaRepository<PTMAppointment, Long> {
    List<PTMAppointment> findByStudent(Student student);
    
    @Query("SELECT a FROM PTMAppointment a WHERE a.slot.teacher = :teacher")
    List<PTMAppointment> findByTeacher(Teacher teacher);
}
