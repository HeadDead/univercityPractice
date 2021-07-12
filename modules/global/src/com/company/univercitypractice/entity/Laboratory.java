package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "UNIVERCITYPRACTICE_LABORATORY")
@Entity(name = "univercitypractice_Laboratory")
@NamePattern("%s|numberCabinet")
public class Laboratory extends StandardEntity {
    private static final long serialVersionUID = 5958455480931231063L;

    @NotNull
    @Column(name = "NUMBER_CABINET", nullable = false)
    private String numberCabinet;

    public String getNumberCabinet() {
        return numberCabinet;
    }

    public void setNumberCabinet(String numberCabinet) {
        this.numberCabinet = numberCabinet;
    }
}