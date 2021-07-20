package com.company.univercitypractice.service;

import com.company.univercitypractice.entity.Employment;

import java.time.LocalDateTime;

public interface TeacherEmploymentService {
    String NAME = "univercitypractice_TeacherEmploymentService";

    public Employment rescheduleEmployment(Employment employment, LocalDateTime newStartDate);
}