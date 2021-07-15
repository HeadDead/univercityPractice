package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_STUDENT")
@Entity(name = "univercitypractice_Student")
@NamePattern("%s %s|firstName,secondName")
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

    @ManyToMany
    @JoinTable(name = "UNIVERCITYPRACTICE_STUDENT_GROUP_LINK",
            joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID"))
    private List<Group> group;

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public List<Group> getGroup() {
        return group;
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