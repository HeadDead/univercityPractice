package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_EMPLOYMENT")
@Entity(name = "univercitypractice_Employment")
@NamePattern("%s|nameEmployment")
public class Employment extends StandardEntity {
    private static final long serialVersionUID = 2788227213292533603L;

    @Column(name = "DURATION", nullable = false)
    @NotNull
    private Integer duration;

    @Column(name = "START_TIME", nullable = false)
    @NotNull
    private LocalDateTime startDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    @NotNull
    @Lob
    @Column(name = "NAME_EMPLOYMENT", nullable = false)
    private String nameEmployment;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUDITORIUM_ID")
    private Auditorium auditorium;

    @ManyToMany
    @JoinTable(name = "UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK",
            joinColumns = @JoinColumn(name = "EMPLOYMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID"))
    private @NotNull List<Group> group;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public List<Group> getGroup() {
        return group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
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

    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusMinutes(duration):null;
    }
}