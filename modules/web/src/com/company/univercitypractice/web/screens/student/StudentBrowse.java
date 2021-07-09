package com.company.univercitypractice.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Student;

@UiController("univercitypractice_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}