package com.company.univercitypractice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_GROUP")
@Entity(name = "univercitypractice_Group")
public class Group extends StandardEntity {
    private static final long serialVersionUID = -2380135346715745321L;

    @NotNull
    @Column(name = "NUMBER_NAME_GROUP", nullable = false)
    private String numberNameGroup;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYMENT_ID")
    private Employment employment;

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