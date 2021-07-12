package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Table(name = "UNIVERCITYPRACTICE_LECTURE")
@Entity(name = "univercitypractice_Lecture")
@NamePattern("%s|numberCabinet")
public class Lecture extends StandardEntity {
    private static final long serialVersionUID = 3518200732221438977L;

    @NotNull
    @Column(name = "CAPACITY", nullable = false)
    @Positive
    private Integer capacity;

    @NotNull
    @Column(name = "NUMBER_CABINET", nullable = false)
    private String numberCabinet;

    public String getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(String numberCabinet) {
        this.numberCabinet = numberCabinet;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}