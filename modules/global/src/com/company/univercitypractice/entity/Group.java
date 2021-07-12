package com.company.univercitypractice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_GROUP")
@Entity(name = "univercitypractice_Group")
public class Group extends StandardEntity {
    private static final long serialVersionUID = -2380135346715745321L;

    @NotNull
    @Column(name = "NUMBER_NAME_GROUP", nullable = false, columnDefinition = "Название группы")
    private String numberNameGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYMENT_ID")
    private Employment employment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUDITORIUM_ID")
    private Auditorium auditorium;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public String getNumberNameGroup() {
        return numberNameGroup;
    }

    public void setNumberNameGroup(String numberNameGroup) {
        this.numberNameGroup = numberNameGroup;
    }


}