package com.smartschoolhub.service;

import com.smartschoolhub.domain.Fee;
import com.smartschoolhub.repository.ExamRepository;
import com.smartschoolhub.repository.FeeRepository;
import com.smartschoolhub.repository.SchoolClassRepository;
import com.smartschoolhub.repository.StudentRepository;
import com.smartschoolhub.repository.SubjectRepository;
import com.smartschoolhub.repository.TeacherRepository;
import com.smartschoolhub.service.dto.DashboardSummary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    private final SchoolClassRepository schoolClassRepository;
    private final SubjectRepository subjectRepository;
    private final ExamRepository examRepository;
    private final FeeRepository feeRepository;

    public DashboardService(StudentRepository studentRepository,
                            TeacherRepository teacherRepository,
                            SchoolClassRepository schoolClassRepository,
                            SubjectRepository subjectRepository,
                            ExamRepository examRepository,
                            FeeRepository feeRepository) {
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
        this.schoolClassRepository = schoolClassRepository;
        this.subjectRepository = subjectRepository;
        this.examRepository = examRepository;
        this.feeRepository = feeRepository;
    }

    public DashboardSummary getSummary() {
        DashboardSummary summary = new DashboardSummary();
        summary.setStudentCount(studentRepository.count());
        summary.setTeacherCount(teacherRepository.count());
        summary.setClassCount(schoolClassRepository.count());
        summary.setSubjectCount(subjectRepository.count());
        summary.setExamCount(examRepository.count());

        List<Fee> fees = feeRepository.findAll();
        double totalDue = fees.stream().mapToDouble(fee -> fee.getAmountDue() != null ? fee.getAmountDue() : 0).sum();
        double totalPaid = fees.stream().mapToDouble(fee -> fee.getAmountPaid() != null ? fee.getAmountPaid() : 0).sum();
        summary.setTotalFeesDue(totalDue);
        summary.setTotalFeesPaid(totalPaid);
        return summary;
    }
}
