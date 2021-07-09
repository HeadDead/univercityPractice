package com.company.univercitypractice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_GROUP")
@Entity(name = "univercitypractice_Group")
public class Group extends StandardEntity {
    private static final long serialVersionUID = -2380135346715745321L;

    @NotNull
    @Column(name = "NUMBER_NAME_GROUP", nullable = false)
    private String numberNameGroup;

    public String getNumberNameGroup() {
        return numberNameGroup;
    }

    public void setNumberNameGroup(String numberNameGroup) {
        this.numberNameGroup = numberNameGroup;
    }
}