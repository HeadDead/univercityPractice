package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NumberFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity(name = "univercitypractice_Lecture")
public class Lecture extends Auditorium {
    private static final long serialVersionUID = 3518200732221438977L;

    @NumberFormat(pattern = "int")
    @NotNull
    @Column(name = "CAPACITY", nullable = false)
    private Integer capacity;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}