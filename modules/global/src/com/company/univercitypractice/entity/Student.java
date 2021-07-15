package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
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

    @Column(name = "NUMBER_BOOKS")
    @Positive
    private Integer numberBooks;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GROUP_ID")
    @NotNull
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setNumberBooks(Integer numberBooks) {
        this.numberBooks = numberBooks;
    }

    public Integer getNumberBooks() {
        return numberBooks;
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