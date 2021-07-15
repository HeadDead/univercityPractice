package com.company.univercitypractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity(name = "univercitypractice_Lecture")
public class Lecture extends Auditorium {
    private static final long serialVersionUID = 3518200732221438977L;

    @NotNull
    @Column(name = "NUMBER_OF_GROUP", nullable = false)
    private Integer numberOfGroup;

    public Integer getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }
}