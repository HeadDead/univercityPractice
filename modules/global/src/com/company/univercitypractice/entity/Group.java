package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_GROUP")
@Entity(name = "univercitypractice_Group")
public class Group extends StandardEntity {
    private static final long serialVersionUID = -2380135346715745321L;

    @NotNull
    @Column(name = "NUMBER_NAME_GROUP", nullable = false)
    private String numberNameGroup;

    @Composition
    @OneToMany(mappedBy = "group")
    private List<Student> student;

    @JoinTable(name = "UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK",
            joinColumns = @JoinColumn(name = "GROUP_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYMENT_ID"))
    @ManyToMany
    private List<Employment> employments;

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public String getNumberNameGroup() {
        return numberNameGroup;
    }

    public void setNumberNameGroup(String numberNameGroup) {
        this.numberNameGroup = numberNameGroup;
    }


}