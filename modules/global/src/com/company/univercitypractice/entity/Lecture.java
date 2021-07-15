package com.company.univercitypractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "univercitypractice_Lecture")
public class Lecture extends Auditorium {
    private static final long serialVersionUID = 3518200732221438977L;

    @Column(name = "NUMBER_OF_GROUP")
    private Integer numberOfGroup;

    public Integer getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }
}