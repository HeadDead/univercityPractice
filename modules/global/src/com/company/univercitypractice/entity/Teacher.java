package com.company.univercitypractice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "UNIVERCITYPRACTICE_TEACHER")
@Entity(name = "univercitypractice_Teacher")
@NamePattern("%s %s|firstName,secondName")
public class Teacher extends StandardEntity {
    private static final long serialVersionUID = 6989820262137451980L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @ManyToMany
    @JoinTable(name = "UNIVERCITYPRACTICE_TEACHER_EMPLOYMENT_LINK",
            joinColumns = @JoinColumn(name = "TEACHER_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYMENT_ID"))
    private List<Employment> employment;

    @NotNull
    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @Column(name = "THIRD_NAME")
    private String thirdName;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    @Email
    private String email;

    public void setEmployment(List<Employment> employment) {
        this.employment = employment;
    }

    public List<Employment> getEmployment() {
        return employment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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