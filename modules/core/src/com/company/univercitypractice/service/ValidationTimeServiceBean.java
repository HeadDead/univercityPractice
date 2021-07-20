package com.company.univercitypractice.service;

import com.company.univercitypractice.entity.Employment;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;

@Service(ValidationTimeService.NAME)
public class ValidationTimeServiceBean implements ValidationTimeService {

    @Inject
    private DataManager dataManager;

    @Override
    public Employment validateTime(Employment employment, LocalDateTime newGetTime) {
        Long check = dataManager
                .loadValue("select ('teacher, startDay') from univercitypractice_Employment e where " +
                        "e.teacher = :teacher" +
                        "e.startDay = :startDay", Long.class)
                .parameter("teacher", employment.getTeacher())
                .parameter("startDay", employment.getStartDate())
                .one();
        if (check == 0){
            return employment;
        }
        employment.setStartDate(newGetTime);
        return dataManager.commit(employment);
    }
}