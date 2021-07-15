package com.company.univercitypractice.web.screens.lecture;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Lecture;

@UiController("univercitypractice_Lecture.edit")
@UiDescriptor("lecture-edit.xml")
@EditedEntityContainer("lectureDc")
@LoadDataBeforeShow
public class LectureEdit extends StandardEditor<Lecture> {
}