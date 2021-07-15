package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_GROUP")
@Entity(name = "univercitypractice_Group")
@NamePattern("%s|numberNameGroup")
public class Group extends StandardEntity {
    private static final long serialVersionUID = -2380135346715745321L;

    @NotNull
    @Column(name = "NUMBER_NAME_GROUP", nullable = false)
    private String numberNameGroup;

    @JoinTable(name = "UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK",
            joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYMENT_ID"))
    @ManyToMany
    private List<Employment> employments;

    @JoinTable(name = "UNIVERCITYPRACTICE_STUDENT_GROUP_LINK",
            joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    @ManyToMany
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public String getNumberNameGroup() {
        return numberNameGroup;
    }

    public void setNumberNameGroup(String numberNameGroup) {
        this.numberNameGroup = numberNameGroup;
    }


}