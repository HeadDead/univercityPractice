package com.company.univercitypractice.web.screens.teacher;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Teacher;

@UiController("univercitypractice_Teacher.edit")
@UiDescriptor("teacher-edit.xml")
@EditedEntityContainer("teacherDc")
@LoadDataBeforeShow
public class TeacherEdit extends StandardEditor<Teacher> {
}