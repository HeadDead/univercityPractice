package com.company.univercitypractice.service;

import com.company.univercitypractice.entity.Employment;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service(TeacherEmploymentService.NAME)
public class TeacherEmploymentServiceBean implements TeacherEmploymentService {

    @Inject
    private DataManager dataManager;

    @Override
    public Employment rescheduleEmployment(Employment employment, LocalDateTime newStartDate) {
        LocalDateTime dayStart = newStartDate.truncatedTo(ChronoUnit.DAYS).withHour(8);
        LocalDateTime dayEnd = newStartDate.truncatedTo(ChronoUnit.DAYS).withHour(19);
        Long employmentTime = dataManager.loadValue("select count(e) from univercitypractice_Employment e where " +
                "(e.startDate between :dayStart and :dayEnd)" +
                "and e.teacher = :teacher " +
                "and e.group = :group" +
                "and e.id <> : employmentId", Long.class)
                .parameter("dayStart", dayStart)
                .parameter("dayEnd", dayEnd)
                .parameter("teacher", employment.getTeacher())
                .parameter("group", employment.getGroup ())
                .parameter("employmentId", employment.getId())
                .one();
        if (employmentTime == 0) {
            return employment;
        }
        employment.setStartDate(newStartDate);
        return dataManager.commit(employment);
    }
}