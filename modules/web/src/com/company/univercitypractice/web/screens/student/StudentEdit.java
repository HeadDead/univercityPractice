package com.company.univercitypractice.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Student;

@UiController("univercitypractice_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}