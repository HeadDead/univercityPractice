package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Table(name = "UNIVERCITYPRACTICE_STUDENT")
@Entity(name = "univercitypractice_Student")
@NamePattern("%s|firstName")
public class Student extends StandardEntity {
    private static final long serialVersionUID = 1082765961846963815L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @Column(name = "THIRD_NAME")
    private String thirdName;

    @NotNull
    @Column(name = "NUMBER_BOOKS", nullable = false)
    @Positive
    private Integer numberBooks;

    public Integer getNumberBooks() {
        return numberBooks;
    }

    public void setNumberBooks(Integer numberBooks) {
        this.numberBooks = numberBooks;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}