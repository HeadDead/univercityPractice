package com.company.univercitypractice.web.screens.lecture;

import com.company.univercitypractice.entity.Group;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Lecture;

import javax.inject.Inject;

@UiController("univercitypractice_Lecture.edit")
@UiDescriptor("lecture-edit.xml")
@EditedEntityContainer("lectureDc")
@LoadDataBeforeShow
public class LectureEdit extends StandardEditor<Lecture> {

}