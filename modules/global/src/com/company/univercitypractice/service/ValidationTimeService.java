package com.company.univercitypractice.service;

import com.company.univercitypractice.entity.Employment;
import com.company.univercitypractice.entity.Teacher;

import java.time.LocalDateTime;

public interface ValidationTimeService {
    String NAME = "univercitypractice_ValidationTimeService";

    public Employment validateTime(Employment employment, LocalDateTime newGetTime);
}