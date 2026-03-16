package com.smartschoolhub.service;

import com.smartschoolhub.domain.Attendance;
import com.smartschoolhub.domain.AttendanceStatus;
import com.smartschoolhub.domain.Grade;
import com.smartschoolhub.domain.Student;
import com.smartschoolhub.repository.AttendanceRepository;
import com.smartschoolhub.repository.GradeRepository;
import com.smartschoolhub.repository.StudentRepository;
import com.smartschoolhub.service.dto.StudentProgress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentPortalService {
    private final StudentRepository studentRepository;
    private final GradeRepository gradeRepository;
    private final AttendanceRepository attendanceRepository;

    public ParentPortalService(StudentRepository studentRepository,
                               GradeRepository gradeRepository,
                               AttendanceRepository attendanceRepository) {
        this.studentRepository = studentRepository;
        this.gradeRepository = gradeRepository;
        this.attendanceRepository = attendanceRepository;
    }

    public StudentProgress getStudentProgress(Long studentId) {
        Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found: " + studentId));

        List<Grade> grades = gradeRepository.findByStudentId(studentId);
        double average = grades.stream().mapToDouble(Grade::getMarks).average().orElse(0.0);

        List<Attendance> attendanceRecords = attendanceRepository.findByStudentId(studentId);
        long present = attendanceRecords.stream().filter(a -> a.getStatus() == AttendanceStatus.PRESENT).count();
        long absent = attendanceRecords.stream().filter(a -> a.getStatus() == AttendanceStatus.ABSENT).count();
        long late = attendanceRecords.stream().filter(a -> a.getStatus() == AttendanceStatus.LATE).count();
        long excused = attendanceRecords.stream().filter(a -> a.getStatus() == AttendanceStatus.EXCUSED).count();

        StudentProgress progress = new StudentProgress();
        progress.setStudentId(student.getId());
        progress.setStudentName(student.getFirstName() + " " + student.getLastName());
        progress.setAverageMarks(average);
        progress.setAttendancePresent(present);
        progress.setAttendanceAbsent(absent);
        progress.setAttendanceLate(late);
        progress.setAttendanceExcused(excused);

        for (Grade grade : grades) {
            StudentProgress.GradeItem item = new StudentProgress.GradeItem();
            item.setExamId(grade.getExam().getId());
            item.setSubjectName(grade.getExam().getSubject().getName());
            item.setMarks(grade.getMarks());
            progress.getGrades().add(item);
        }

        return progress;
    }
}
