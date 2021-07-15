package com.company.univercitypractice.web.screens.lecture;

import com.haulmont.cuba.gui.screen.*;
import com.company.univercitypractice.entity.Lecture;

@UiController("univercitypractice_Lecture.browse")
@UiDescriptor("lecture-browse.xml")
@LookupComponent("lecturesTable")
@LoadDataBeforeShow
public class LectureBrowse extends StandardLookup<Lecture> {
}