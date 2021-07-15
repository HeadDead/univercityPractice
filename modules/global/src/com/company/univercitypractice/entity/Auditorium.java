package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_AUDITORIUM")
@Entity(name = "univercitypractice_Auditorium")
@NamePattern("%s|numberCabinet")
public class Auditorium extends StandardEntity {
    private static final long serialVersionUID = -6118622145986950290L;

    @NotNull
    @Column(name = "NUMBER_CABINET", nullable = false)
    private Integer numberCabinet;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "auditorium")
    private Employment employment;

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Integer getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(Integer numberCabinet) {
        this.numberCabinet = numberCabinet;
    }
}