package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_AUDITORIUM")
@Entity(name = "univercitypractice_Auditorium")
@NamePattern("%s %s|laboratory,lecture")
public class Auditorium extends StandardEntity {
    private static final long serialVersionUID = -6118622145986950290L;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYMENT_ID")
    private Employment employment;

    @OneToMany(mappedBy = "auditorium")
    private List<Group> group;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LABORATORY_NUMBERCABINET")
    @OnDeleteInverse(DeletePolicy.UNLINK)
    private Laboratory laboratory;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LECTURE_ID")
    private Lecture lecture;

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public List<Group> getGroup() {
        return group;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }
}