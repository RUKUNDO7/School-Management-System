package com.smartschoolhub.service.dto;

import com.smartschoolhub.domain.AttendanceStatus;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class TeacherAttendanceRequest {
    @NotNull
    private Long teacherId;

    @NotNull
    private LocalDate date;

    @NotNull
    private AttendanceStatus status;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }
}
