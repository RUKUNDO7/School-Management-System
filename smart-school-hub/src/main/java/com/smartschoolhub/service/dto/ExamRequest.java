package com.smartschoolhub.service.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ExamRequest {
    @NotNull
    private Long classId;

    @NotNull
    private Long subjectId;

    @NotNull
    private LocalDate date;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
