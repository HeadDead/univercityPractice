package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_EMPLOYMENT")
@Entity(name = "univercitypractice_Employment")
@NamePattern("%s|nameEmployment")
public class Employment extends StandardEntity {
    private static final long serialVersionUID = 2788227213292533603L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DAY_", nullable = false)
    private Date day;

    @Column(name = "DURATION", nullable = false)
    @NotNull
    private Integer duration;

    @Column(name = "START_TIME", nullable = false)
    @NotNull
    private LocalTime startDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    @NotNull
    @Lob
    @Column(name = "NAME_EMPLOYMENT", nullable = false)
    private String nameEmployment;

    @OneToMany(mappedBy = "employment")
    private List<Group> group;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AUDITORIUM_ID")
    private Auditorium auditorium;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }


    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getNameEmployment() {
        return nameEmployment;
    }

    public void setNameEmployment(String nameEmployment) {
        this.nameEmployment = nameEmployment;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @MetaProperty(related = {"startDate", "duration"})
    public LocalTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusMinutes(duration):null;
    }
}