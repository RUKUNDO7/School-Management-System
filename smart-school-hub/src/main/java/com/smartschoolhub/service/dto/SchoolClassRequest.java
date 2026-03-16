package com.smartschoolhub.service.dto;

import jakarta.validation.constraints.NotBlank;

public class SchoolClassRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String gradeLevel;

    private Long teacherId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
