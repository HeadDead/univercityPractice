package com.company.univercitypractice.web.screens.teacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Teacher;

@UiController("univercitypractice_Teacher.browse")
@UiDescriptor("teacher-browse.xml")
@LookupComponent("teachersTable")
@LoadDataBeforeShow
public class TeacherBrowse extends StandardLookup<Teacher> {
}