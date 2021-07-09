package com.company.univercitypractice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_EMPLOYMENT")
@Entity(name = "univercitypractice_Employment")
public class Employment extends StandardEntity {
    private static final long serialVersionUID = 2788227213292533603L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DAY_", nullable = false)
    private Date day;

    @Temporal(TemporalType.TIME)
    @NotNull
    @Column(name = "TIME_", nullable = false)
    private Date time;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}