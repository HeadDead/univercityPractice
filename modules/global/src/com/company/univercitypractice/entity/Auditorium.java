package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_AUDITORIUM", indexes = {
        @Index(name = "IDX_UNIVERCITYPRACTICE_AUDITORIUM_CAPACITY", columnList = "CAPACITY"),
        @Index(name = "IDX_UNIVERCITYPRACTICE_AUDITORIUM_NUMBER", columnList = "NUMBER_")
})
@Entity(name = "univercitypractice_Auditorium")
public class Auditorium extends StandardEntity {
    private static final long serialVersionUID = -6118622145986950290L;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "auditorium")
    private Employment employment;

    @NumberFormat(pattern = "float")
    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }
}