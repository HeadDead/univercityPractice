package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Table(name = "UNIVERCITYPRACTICE_AUDITORIUM")
@Entity(name = "univercitypractice_Auditorium")
@NamePattern("%s|numberCabinet")
public class Auditorium extends StandardEntity {
    private static final long serialVersionUID = -6118622145986950290L;

    @Column(name = "NUMBER_CABINET", nullable = false)
    @NotNull
    private Integer numberCabinet;

    @Column(name = "NUMBER_OF_GROUP")
    @NotNull
    @Positive
    private Integer numberOfGroup;

    public Integer getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void setNumberCabinet(Integer numberCabinet) {
        this.numberCabinet = numberCabinet;
    }

    public Integer getNumberCabinet() {
        return numberCabinet;
    }

}