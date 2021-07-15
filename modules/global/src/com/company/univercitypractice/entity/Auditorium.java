package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_AUDITORIUM")
@Entity(name = "univercitypractice_Auditorium")
@NamePattern("%s|numberCabinet")
public class Auditorium extends StandardEntity {
    private static final long serialVersionUID = -6118622145986950290L;

    @NotNull
    @Column(name = "NUMBER_CABINET", nullable = false)
    private Integer numberCabinet;

    public Integer getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(Integer numberCabinet) {
        this.numberCabinet = numberCabinet;
    }
}